package org.example;

import java.util.List;

/**
 * Main exercise class.
 */
public class Main {
    /**
     * Divide two numbers, throwing an unchecked ArithmeticException if the denominator is zero.
     * @param a
     * @param b
     * @return The result of the division
     */
    private static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    /**
     * Divide two numbers safely.  If the result is zero, it will return 0.
     *
     * @param a The numerator
     * @param b The denominator
     * @return The result of the division
     */
    public static double safeDivision(double a, double b) {
        // todo: Handle the unchecked ArithmeticException by returning 0.
        return divide(a, b);
    }

    /**
     * Get the second letter of a string.
     *
     * @param s String to get the second letter from
     * @param logMessages List of log messages to add to
     * @return The second letter of the string
     */
    public static String getSecondLetter(String s, List<String> logMessages) {
        // TODO: Handle the StringIndexOutOfBoundsException by returning an empty string ("")
        return s.substring(1, 2);

        // TODO: This line needs to happen after the try/catch block, regardless of whether an exception is thrown (put it in a finally block)
        logMessages.add("Exiting method");
    }

    /**
     * Safely divide two numbers.  If the denominator is zero, it will return 0.
     *
     * @param a The numerator
     * @param b The denominator
     * @return The result of the division
     */
    public static double safeDivideWithCustomException(double a, double b) throws CustomDivideByZeroException {
        // TODO: handle divide by zero by throwing a CustomDivideByZeroException
        // TODO: Modify the custom exception to pass a,b to the constructor and store them in the exception (see CustomDivideByZeroException.java)
        return divide(a, b);
    }
}
