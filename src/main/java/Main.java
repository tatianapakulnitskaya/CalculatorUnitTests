public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum " + calculator.sum(1, 2));
        System.out.println("Subtract " + calculator.subtract(1, 10));
        System.out.println("Multiply " + calculator.multiply(1, 10));
        System.out.println("Divide " + calculator.divide(10, 10));
    }
}
