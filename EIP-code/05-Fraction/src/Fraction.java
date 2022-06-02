import java.util.Scanner;

public class Fraction {
    private int nominator;
    private int denominator;

    public int getDenominator() {
        return denominator;
    }

    public int getNominator() {
        return nominator;
    }

    public Fraction(int nominator, int denominator){
        if(nominator == 0 ) nominator = 1;
        this.nominator = nominator;
        this.denominator = denominator;
    }
    public Fraction(int n){
        this.nominator = n;
    }
    public void multiply(Fraction factor){
        this.nominator = factor.getNominator() * this.getNominator();
        this.denominator = factor.getDenominator() * this.getDenominator();

    }

    public void add(Fraction summand){
        this.nominator = (this.nominator * summand.getDenominator() )+ (summand.getNominator() * this.denominator);
        this.denominator = this.denominator * summand.getDenominator();

    }

    public double asDoubele(){
       return ((double) this.getNominator()/ (double) this.getDenominator());
    }

}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nominator: ");
        int nominator = scanner.nextInt();
        System.out.print("\n Denominator: ");
        int denominator = scanner.nextInt();

        Fraction fraction = new Fraction(nominator, denominator);

        System.out.println("toll nun geben wir das hergestellte Fraction aus");
        System.out.println("Nominator: " + fraction.getNominator());
        System.out.println("Denominator: " + fraction.getDenominator());
        System.out.println("Bruch: " + fraction.asDoubele());

        System.out.println("gib ne adere Fraction");
        System.out.print("Nominator: ");
        int nominator2 = scanner.nextInt();
        System.out.print("\n Denominator: ");
        int denominator2 = scanner.nextInt();
        Fraction fraction2 = new Fraction(nominator2, denominator2);
//        fraction.multiply(fraction2);
        fraction.add(fraction2);

        System.out.println("toll nun geben wir das hergestellte Fraction aus");
        System.out.println("Nominator: " + fraction.getNominator());
        System.out.println("Denominator: " + fraction.getDenominator());
        System.out.println("Bruch: " + fraction.asDoubele());



    }
}