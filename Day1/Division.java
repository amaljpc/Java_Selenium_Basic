public class Division {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            double quotient = (double) a / b;
            System.out.println("Quotient: " + quotient);
        }
    }
}

