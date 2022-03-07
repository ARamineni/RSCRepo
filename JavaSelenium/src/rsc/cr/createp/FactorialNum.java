package rsc.cr.createp;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int fact=1, c;
		
		c=sc.nextInt();
		
		for(int i=1; i<=c; i++)
		{
			fact = fact*i;
			
		}
		
		System.out.println("the factiorial of the given number is" + "  " + fact);

	}

}
