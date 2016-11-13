/* Nested interface */

package niit;

interface Showable{  
	  void show();  
	  interface Message{  
	   void msg();  
	  }  
	}  
public class NestedInterface  implements Showable.Message {
	 
		 public void msg(){System.out.println("Hello nested interface");}  
		  
		 public static void main(String args[]){  
		  NestedInterface message=new NestedInterface(); 
		  message.msg();  
		 }  
		}  

	

