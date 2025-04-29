//write a program to find the SI(simple interest).
import java.util.*;

public class Simple_Interest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Amt.:  ");
        int Amt = sc.nextInt();
        System.out.print("Enter your Rate:  ");
        int Rate = sc.nextInt();
        System.out.print("Enter your Time.:  ");
        int Time = sc.nextInt();

        float simpleInterest = Amt * Rate * Time / 100;
        
        System.out.print("The SimpleInterest is : " + simpleInterest);
    }
}