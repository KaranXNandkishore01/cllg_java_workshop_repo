// Inner lamdae expression
// Java program to demonstrate the use of inner lambda expression
interface Demo extends FunctionalInterface {
}
interface Sales {
    void sales();
}

public class InnerLambdaExpression {
    public static void main(String[] args) {
        int x = 9000;

        Sales d1 = () -> {
            System.out.println("Hello world " + x);
        };

        d1.sales(); // Calling the lambda
    }
}
