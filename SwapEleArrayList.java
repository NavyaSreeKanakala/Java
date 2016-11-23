package slt;

import java.util.*;

public class SwapEleArrayList {
	
	public static void main(String args[])
	{
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("1");
		al.add("9");
		al.add("2");
		al.add("1");
		
	   System.out.println(al);
	   
	   Collections.swap(al,2,3);
	   
	   System.out.println(al);
	  
		
	}
	
}
