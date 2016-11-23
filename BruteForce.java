/* Applying bruteforce attack to stop printing of numbers if 42 is occurred */ 

package slt;

import java.util.Scanner;

public class BruteForce {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int num=sc.nextInt();
		
	    int[] numbers = new int[num];
	    
	    System.out.println("Please enter numbers");
	    
	    for(int i =0;i<numbers.length;i++)
	    {
	        numbers[i] = sc.nextInt();
	    }
      
	    for(int j=0;j<numbers.length;j++)
	    {
	    	if(numbers[j]==42)
	    	{
	    	  	break;//System.out.println(numbers[j]);
	    	}
	    	else
	    	{
	    		System.out.println(numbers[j]);
	    	}
	}
	}
}
