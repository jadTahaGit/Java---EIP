import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Zahl n ein: ");
        int n = scanner.nextInt();
        calculateCollatzNumbers(n);
        scanner.close();
    }

    public static void calculateCollatzNumbers(int n){
        while(n > 1){
            if( n % 2 == 0) {
                // z gerade => nächste Zahl: z/2
                n = n/2;
                System.out.println(n);
            } else if ( n % 2 != 0 ){
                // z ungerade => nächste Zahl: 3z+1
                n = 3*n +1;
                System.out.println(n);
            }
        }
    }
}
