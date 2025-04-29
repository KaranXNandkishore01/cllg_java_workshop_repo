//Q: Write a program to print the pyramid pattern using characters by taking input n from the user.
import java.util.*;

public class Loops_fundamental {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, n;
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            // Print spaces
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print increasing characters
            char ch = 'A';
            for (j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            // Print decreasing characters
            ch -= 2;
            for (j = 0; j < i; j++) {
                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }
    }
}
