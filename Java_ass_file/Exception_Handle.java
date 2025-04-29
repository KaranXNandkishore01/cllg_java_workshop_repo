// //Exception handling is used to execute the upcoming code:

public class Exception_Handle {
    public static void main(String[] args) {
        int a = 40, b = 0;

        for (int i = 0; i < 10; i++) {
            try {
                for (int j = 0; j < 10; j++) {
                    if (i == j) {
                        int c = a / b; // This will throw ArithmeticException
                        System.out.println(c);
                    }
                    System.out.println(i);
                }
            } catch (ArithmeticException ae) {
                System.out.println("ArithmeticException occurred: Division by zero");
            } finally {
                System.out.println("Finally block executed for i = " + i);
            }
        }
    }
}






// what is in exception?
// Exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. In Java, exceptions are represented by classes that inherit from the Throwable class. Exceptions can be categorized into two main types: checked exceptions and unchecked exceptions.