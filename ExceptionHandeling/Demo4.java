package com;

public class Demo4 {
    public static void main(String[] args) {

        // Program execution starts here
        System.out.println("start");

        try {
            // Declaring a null string reference
            String s = null;

            // This line will throw NullPointerException
            System.out.println(s.length());
        }

        // This block handles ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index");
        }

        // This block handles ArithmeticException (e.g., divide by zero)
        catch (ArithmeticException e) {
            System.out.println("null value"); // ❗ message is misleading
        }

        // This block handles invalid type casting
        catch (ClassCastException e) {
            System.out.println("invalid type casting");
        }

        // Generic exception handler (handles all other exceptions)
        catch (Exception e) {
            System.out.println("Superclass exception handled");
        }

        // Program execution ends here
        System.out.println("end");
    }
}