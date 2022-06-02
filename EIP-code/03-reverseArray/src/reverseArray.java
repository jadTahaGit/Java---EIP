import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int[] array = new int[5];
        while(n<5) {
             System.out.println( (n+1) + "Number:");
             array[n]= scanner.nextInt();
             n++;
        }
        System.out.println("your Array is: " + Arrays.toString(array));
        int[] reversedArray = reverse(array);
        System.out.println("The reversed Array is: " + Arrays.toString(reversedArray));
    }

    public static int[] reverse(int[] array){
        int [] rev_arr = new int[5];
        for (int i = 0; i < array.length; i++) {
            rev_arr[array.length-1-i] = array[i];
        }
        return rev_arr;
    }


}
