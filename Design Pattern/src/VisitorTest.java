public class VisitorTest {
    public static void main(String[] args) {
        TaxVisitor taxClac = new TaxVisitor();
        TaxVisitor taxHolidayCalc = new TaxVisitor();

        Necessity milk = new Necessity(1.20);
        Fruit banana = new Fruit(0.60);
        Liquor eggsLiquor = new Liquor(11.47);

        System.out.println(milk.accept(taxClac) + "\n");
        System.out.println(milk.accept(taxClac) + "\n");
        System.out.println(milk.accept(taxClac) + "\n");

    }
}
