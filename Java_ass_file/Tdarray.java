import java.util.*;

public class Tdarray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j,k,sm=0;
        {
            for(i=0; i<3; i++)
            {
                for(j=0; j<3; j++)
                {
                    for(k=0; k<3; k++){
                        sm += a[i][k]*b[k][j];
                    }
                    c[i][j]=sm;
                    sm=0;
                }
            // {
            // a[i][j]=sc.nextInt();
            // }
            System.out.println(sm);
        }
    }
  }
}