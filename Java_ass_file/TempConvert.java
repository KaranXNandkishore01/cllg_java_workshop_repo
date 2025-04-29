// Write a program to convert temperature from Fahrenheit(f) to Celsius(C) as C = 5*(f-32)/9;

import java.util.*;
public class TempConvert {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        int f = sc.nextInt();
        float C = 5*(f-32)/9;
        System.out.print("Temperature is :" + C +"'C");
    }
}