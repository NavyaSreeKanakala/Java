/* Check whether a string given is palindrome or not */

package slt;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]){
		
	Scanner scr=new Scanner(System.in);
	
	System.out.println("Enter the string");
	String str=scr.nextLine();
	
    String rev="";
    
    int len = str.length();
    
    for (int i=len-1;i>=0;i--)
    {
    	
    	 rev = rev + str.charAt(i);
    }

    System.out.println("Reversed string is: "+rev);
    
    if(str.equals(rev))
    {
    	System.out.println("YES");
    }
    else
    {
    	System.out.println("NO");
    }
	
		
}
}
