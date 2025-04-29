import java.util.*;

public class LargestAmongFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        // Input 4 numbers
        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        d = sc.nextInt();

        // Assume 'a' is the largest initially
        int largest = a;

        if (b > largest)
            largest = b;
        if (c > largest)
            largest = c;
        if (d > largest)
            largest = d;

        System.out.println("The largest number is: " + largest);
    }
}
