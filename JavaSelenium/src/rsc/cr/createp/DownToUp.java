package rsc.cr.createp;
import java.util.Scanner;

public class DownToUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row , i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for pattern" );
		row =sc.nextInt();
		
		for (i=row-1;i>=0; i--)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			
			System.out.println();   
		}
	}
}
