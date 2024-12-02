public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Attempting to perform a division operation.");
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Oops! Something went wrong: couldn't divide by zero " + e.getMessage()); 
        } finally {
            System.out.println("Finally block executed, performing cleanup tasks.");
        }

        System.out.println("Execution continues after the exception handling.");
    }
}
