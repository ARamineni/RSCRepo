package rsc.cr.createp;

import java.util.Scanner;

public class LeftPyramid {

	public static void main(String[] args) {
		int row , i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for pattern" );
		row =sc.nextInt();
		
		for (i=0;i<row; i++)    
		{
			//for(j=row-i;j>1;j--)
			for (j=2*(row-i); j>=0; j--)    
			{
				System.out.print(" ");
			}
			
			for(j=0;j<=i; j++)  
			{
				System.out.print("* ");
				
			}
			
			System.out.println();   
		}
		
		for (i=row-2;i>=0; i--)
		{
			for(j=0;j<=2*(row-i); j++)
				{
				 System.out.print(" ");
				}
			//for(j=2;j<=row-i; j++)
			//{
			// System.out.print(" ");
			//}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			
			System.out.println();   
		}




	}

}
