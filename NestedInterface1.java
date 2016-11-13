/* Nested interfaces-class nested inside an interface */

package niit;

class A{  
	  interface Message{  
	   void msg();  
	  }  
	}  

public class NestedInterface1 implements A.Message{
	
	 public void msg(){System.out.println("Hello nested interface");} 
	
	
	public static void amin(String args[]){
		
		 A.Message message=new NestedInterface1(); //upcasting
		  message.msg();  
		
				
	}
	
}
