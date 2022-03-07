package rsc.cr.createp;

import java.util.Scanner;

public class SwapNumber {
	
	public void swapnumbers()
	{
		int a,b,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value a");
		a= sc.nextInt();
		System.out.println("enter value b");
		b= sc.nextInt();
		
		a = a+b;
		System.out.println("value of a is " +a);
		b=a-b;
		System.out.println("value of b is " +b);
		a=a-b;
		System.out.println("value of a is " +a);
		
		System.out.println("final out put values of a is "+ a);
		System.out.println("final out put values of b is "+ b);
		
		//3rd variable 
		c=a;
		a=b;
		b=c;
		
		System.out.println("final out put values of a is "+ a);
		System.out.println("final out put values of b is "+ b);
		
		
		
	}

	public static void main(String[] args) {
	
		SwapNumber sn = new SwapNumber();
		sn.swapnumbers();
	}

}
