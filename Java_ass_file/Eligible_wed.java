//Write a program for accept person(age int), and gender(int 1 for male and 0 for female), then check whether the person is eligible for marriage or not;

import java.util.*;
public class Eligible_wed{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the age of the person:  ");
        int age = sc.nextInt();
        System.out.print("Enter you 1 or 0: ");
        int gender = sc.nextInt();
        if(age>=18){             //check the age
        System.out.print("You are eligible.");
        }else{
            System.out.println("You are not eligible.");
        }
        if(gender==1){              // gender in the nestedloop
            System.out.println("You are male. ");
        }if(gender==0){
            System.out.print("you are female. ");
        }
    }
}
