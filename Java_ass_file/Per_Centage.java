// WAP to get percentage of 5 subjects.
import java.util.*;
public class Per_Centage{

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr the marks one by one:");
    int maths = sc.nextInt();
    int phy = sc.nextInt();
    int chem = sc.nextInt();
    int eng = sc.nextInt();
    int hin = sc.nextInt();

    int sum = maths+phy+chem+hin+eng;
    double percentage = sum/5;
    System.out.print(percentage);
    }
}