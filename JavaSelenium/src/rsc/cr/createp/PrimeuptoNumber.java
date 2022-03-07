package rsc.cr.createp;

import java.util.Scanner;

public class PrimeuptoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nu, i, j , count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		nu=sc.nextInt();
		
		
		
		System.out.println("Prime numbers up to value " );
		
		for(i=2;i<=nu;i++)
		{ 
			for(j=1;j<=i;j++)
			{

			if(i%j==0)
				
			count++;
			//System.out.println("count is" + count);
				
		}
		
		if(count==2)
	     System.out.print(" "+i);
	     count=0;			
		
		}
	}
}
		 

