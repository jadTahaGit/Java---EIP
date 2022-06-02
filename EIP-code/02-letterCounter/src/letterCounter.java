import java.util.Scanner;
public class letterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zeichenfolge ein: ");
        String eingabe = scanner.nextLine();
        char[] zeichen = eingabe.toCharArray();
        countTEL (zeichen);
        scanner.close();
    }

    public static int countTEL(char[] zeichen){
        int anzahl = 0 ;
        for (int i = 0; i < zeichen.length; i++) {
            if (zeichen[i] == 't' || zeichen[i] == 'e' || zeichen[i] == 'l'
             || zeichen[i] == 'T' || zeichen[i] == 'E' || zeichen[i] == 'L') anzahl++;
        }
        System.out.println(anzahl);
        return  anzahl;
    }
}
