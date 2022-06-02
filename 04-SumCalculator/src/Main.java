public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("sub = " + calculator.getSubstractionResult());
        System.out.println("mul = " + calculator.getMultiplicationResult());
        System.out.println("div = " + calculator.getDivisonResult());
    }
}
