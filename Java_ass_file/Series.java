//sum of series 1^2 + 2^2 + 3^2 .......+ n^2

import java.util.Scanner;
class Series{
	public static void main(String args[]){
	Scanner scr = new Scanner(System.in);
	int n,sum = 0;
	System.out.print("enter number: ");
	n = scr.nextInt();
	for ( int i = 1;i<=n ;i++ )
	{
		sum = sum + (i*2);
	}
	System.out.println(sum);
	}
}