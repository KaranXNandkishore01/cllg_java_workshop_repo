// prints the pyramid pattern using stars

import java.util.Scanner;

public class Pyramid_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, n ; 
        System.out.print("Enter number of rows: ");
        n = sc.nextInt(); // taking rows as input
        for (i = 0; i < n; i++) {
            // Print spaces
            for (k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }

            // Print stars
            for (j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
