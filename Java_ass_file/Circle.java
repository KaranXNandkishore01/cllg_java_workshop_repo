// Questions WAP.
//1: Circumference and Area of the circle.
import java.util.*;

public class Circle{

    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of the rad:" + " ");
        float rad = scr.nextFloat();
        float Circumference = 2 * 3.14f * rad;
        System.out.print(Circumference + "\n");
        float Area = 2 * 3.14f * rad;
        System.out.print(Area);

    }
}