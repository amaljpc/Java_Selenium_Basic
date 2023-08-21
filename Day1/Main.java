public class Main {

    public static void performAddition(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void performSubtraction(int a, int b) {
        int difference = a - b;
        System.out.println("Difference: " + difference);
    }

    public static void performDivision(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            double quotient = (double) a / b;
            System.out.println("Quotient: " + quotient);
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        performAddition(a, b);
        performSubtraction(a, b);
        performDivision(a, b);
        Addition adt = new Addition();
        adt.test();
    }
}