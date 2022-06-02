import  java.text.DecimalFormat;

public class TaxVisitor implements Visitor{

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public TaxVisitor(){
    }

    @Override
    public double visit(Fruit apple) {
        System.out.println("This is an Apple: Price with Tax");
        return Double.parseDouble(decimalFormat.format((apple.getPrice() * .18) + apple.getPrice()));
    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("This is a liquerItem: Price with Tax");
        return Double.parseDouble(decimalFormat.format((liquorItem.getPrice() * 32) + liquorItem.getPrice()));
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("This is a Necessity: Price with Tax");
        return Double.parseDouble(decimalFormat.format((necessityItem.getPrice() * .0) + necessityItem.getPrice()));
    }
}
