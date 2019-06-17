/**
 *
 * This class provides main method to run the solutions for problems.
 *
 * @author  Ganesan Rajam
 */
public class ExerciseMain {

    public static void runFactorial() {
        Factorial factorial = new Factorial();

        try {
            for (int i = 0; i < 14; i++) {
                System.out.println("Factorial for : " + i + " is : " + factorial.factorial(i));
                System.out.println("Factorial for : " + i + " is : " + factorial.factorialUsingRecursion(i));
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public static void main(String args[])
    {
        runFactorial();
    }
}
