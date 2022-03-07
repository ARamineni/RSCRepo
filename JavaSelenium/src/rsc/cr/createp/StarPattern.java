package rsc.cr.createp;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row , i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for pattern" );
		row =sc.nextInt();
		
		for (i=0;i<row; i++)
		{
			for(j=0;j<=i; j++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();   
		}
	}
	

}
