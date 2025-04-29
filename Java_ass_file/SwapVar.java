//Swapping two numbers without using a third variable
public class SwapVar {
    public static void main(String[] args) {
        int a = 34;
        int b = 54;

        // Swapping without third variable
        a = a + b; // a becomes 88
        b = a - b; // b becomes 34
        a = a - b; // a becomes 54

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
