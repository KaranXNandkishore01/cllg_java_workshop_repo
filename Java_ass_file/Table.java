// Write a table of any number;
import java.util.*;
public class Table{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("The table of : ");
        // int num = sc.nextInt();
        int num = 1;
        int i=1;
        for(num=1; num<= 20; num++){
            for(i=1; i<= 10; i++){
                int tableNum = i*num;
                System.out.println(num + " x "+ i + " = "+ tableNum);
            }
            System.out.println();
        }
    }
}