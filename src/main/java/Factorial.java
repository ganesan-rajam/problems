/**
 * <h1>An implementation of Factorial function.</h1>
 *
 * This class provides implementation of Factorial function.
 *
 * A factorial of a positive integer n, denoted by <tt>n!</tt>, is the product
 * of all positive integers less than or equal to n.
 *
 * @author  Ganesan Rajam
 * @version 1.0
 * @since   2019-06-13
 */

public class Factorial {
    int argMaxValForRetInt = findArgMaxValForRetInt();

    /**
     * Identifies the maximum acceptable number for input argument of factorial method which can produce
     * factorial result within Integer.MAX_VALUE range for the system.
     */
    private int findArgMaxValForRetInt() {
        long res = 2;
        int num = 2;

        while (true) {
            ++num;
            res = res * num;
            if (res > Integer.MAX_VALUE) {
                return num - 1;
            }
        }
    }

    private void rangeCheckForInt(int n) {
        if (n < 0 || n > argMaxValForRetInt) {
            throw new IllegalArgumentException("Invalid value for 'n': " + n + ". Valid range: 0.." + argMaxValForRetInt);
        }
    }

    private int factorialRecurse (int n) {
        return (n == 2) ? 2 : n * factorialUsingRecursion(n-1);
    }

    /**
     * Method to compute factorial for non-negative number 'n'.
     *
     * This method uses recursion to compute the factorial.
     *
     * @param  n number for which factorial should be computed
     * @return the computed factorial value
     * @throws IllegalArgumentException if the specified 'n' value is negative or greater than maximum
     *         acceptable limit, which can produce factorial result within Integer.MAX_VALUE range for
     *         the system.
     */
    public int factorialUsingRecursion(int n) {
        rangeCheckForInt(n);

        if (n == 0 || n == 1) {
            return 1;
        }

        return factorialRecurse(n);
    }

    /**
     * Method to compute factorial for non-negative number 'n'.
     *
     * @param  n number for which factorial should be computed
     * @return the computed factorial value
     * @throws IllegalArgumentException if the specified 'n' value is negative or greater than maximum
     *         acceptable limit, which can produce factorial result within Integer.MAX_VALUE range for
     *         the system.
     */
    public int factorial(int n) {
        rangeCheckForInt(n);

        if (n == 0 || n == 1) {
            return 1;
        }

        int fact = 2;
        while (n > 2) {
            fact = fact * n;
            n--;
        }

        return fact;
    }
}
