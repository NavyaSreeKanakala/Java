/* Conversion toLower and toUpper case of a given string */

package slt;

import java.util.Scanner;

public class ToLowerUpper {
	
	public static void main(String args[])
	{    
	
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scr.nextLine();
		
	    char[] a=str.toCharArray();
	    
	   
	    for(int i=0;i<a.length;i++)
	    {
	    	if(a[i]>=65 && a[i]<=90)
	    	{
	    	    a[i]+=32;
	    	}
	    	else
	    	{
	    		a[i]-=32;
	    	}
	    }	
	    	
	    for(char b:a)
		System.out.println(b);   
	  
	    
}
}
