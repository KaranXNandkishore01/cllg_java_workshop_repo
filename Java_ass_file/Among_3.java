// Greatest among 3;
import java.util.*;
public class Among_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b, and c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.print("a is greater.");
            if(b>=c && b>=a){
                System.out.print("b is greater.");
            }
        }else{
            System.out.println("c is greater");
        }
    }
}