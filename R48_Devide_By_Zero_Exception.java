class DivideByZeroException extends RuntimeException {
        public DivideByZeroException(String message) {
            super(message);
        }
}
public class R48_Devide_By_Zero_Exception {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        System.out.println("Attempting to divide " + numerator + " by " + denominator);
        try {
            if (denominator == 0)
                throw new DivideByZeroException("Division by zero is not allowed.");
            double result = (double) numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch (DivideByZeroException e) {
            System.out.println("\n*** ERROR CAUGHT ***");
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
