package stringExamples;

import java.util.Arrays;
import java.util.Scanner;

public class NumOfCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		
		System.out.println("please enter the string ");
		
		String str1= sc.nextLine();
		
		Scanner sc1 = new Scanner( System.in);
		System.out.println("please enter the string ");
		
		String str2= sc.nextLine();
		
		int count =0;
		 for(int i=0; i<str1.length(); i++)
			 
		 {
			 if(str1.charAt(i) != ' ')  
				 count ++;
			 
		 }
		 
		 System.out.println("the count of characters in string is " + count);
		
		
		 char[] c1 = str1.toCharArray();
		  
		 char[] c2 = str2.toCharArray();
		 
		 Arrays.sort(c1);
		 Arrays.sort(c2);
		 
		 if(Arrays.equals(c1, c2)== true)
		 {
			 System.out.println("both strings are same");
		 }
		 
		 else
		 {
		 
			 System.out.println("strings are not same ");
		 
		 }
		 
	}

}
