package rsc.cr.createp;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nu, i ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		nu=sc.nextInt();
		
		if(nu<=1)
		{
			System.out.println("please enter above 2 or above 2");
			
		}
		for(i=2;i<nu;i++)
		{
			if(nu%i==0)
				
			{
				System.out.println("not a prime number ");
				break;
			}
			
		}
		if(nu==i)
		{
			System.out.println("prime number");
			System.out.println("value of i" + i);
		}	

}
}
