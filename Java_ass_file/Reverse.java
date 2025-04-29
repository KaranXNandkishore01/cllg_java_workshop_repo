//WAP to reverse the input number;
import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int reversed = 0;
        while(num!=0){
            int num2 = num%10;
            reversed = reversed*10+num2;
            num/=10;
        }
        System.out.println("the reversed number is "+ reversed);
    }
}

