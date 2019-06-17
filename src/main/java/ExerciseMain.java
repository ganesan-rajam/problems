public class ExerciseMain {

    public static void main(String args[])
    {
        Factorial factorial = new Factorial();

        try {
            for (int i = 0; i < 17; i++) {
                System.out.println("Factorial for : " + i + " is : " + factorial.factorial(i));
                System.out.println("Factorial for : " + i + " is : " + factorial.factorialUsingRecursion(i));
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
