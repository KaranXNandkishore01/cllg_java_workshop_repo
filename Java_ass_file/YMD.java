// write a program which accepts days as integer and displays total no. of years, months, and days.

import java.util.*;
public class YMD{

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int Year, Months, Days;
    System.out.print("Inter the number of days : ");
    int num_Days = sc.nextInt();
    Year = num_Days/365;
    int r1 = num_Days%365;
    Months = r1/30;
    Days = r1%30;
    System.out.println("The total year = " + Year);
    System.out.println("The total Month = " + Months);
    System.out.println("The total Days = " + Days);
    }
}
