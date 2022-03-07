package rsc.cr.createp;

import java.util.Scanner;

public class OddEven {
	
	
	
	public void oddevenF()
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter number ");
		
		int Nu = sc.nextInt();
		
		if(Nu%2==0)
		{
			System.out.println("number" + Nu + " is even number ");
		}
		else 
		{
			System.out.println("number" + Nu + " is odd number ");
		}
	}

	public static void main(String[] args) {
		
		OddEven OE = new OddEven();
		OE. oddevenF();

	}

}
