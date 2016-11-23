package slt;

import java.util.*;
public class HashsetToTreeset {
	
	public static void main(String args[])
	{
	
		HashSet<String> hs=new HashSet<String>();
	    hs.add("9");
	    hs.add("3");
	    hs.add("7");
	    hs.add("1");
	    
	    HashSet<String> hs1=new HashSet<String>();
	    hs1.add("vamshi");
	    hs1.add("bharat");
	    hs1.add("ajay");
	    hs1.add("kumar");
	
	  TreeSet<String> ts=new TreeSet<String>(hs);
	  TreeSet<String> ts1=new TreeSet<String>(hs1);
	
	  System.out.println(ts);
	  System.out.println(ts1);
	}	
	
}
