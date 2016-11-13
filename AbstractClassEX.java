/* Abstract class */

package niit;


abstract class Bike{  
	  abstract void run();  
	}  


public class AbstractClassEX extends Bike {
	
	void run(){System.out.println("running safely..");}  
	
	public static void main(String args[]){  
	 AbstractClassEX obj = new AbstractClassEX();  
	 obj.run();  
	}  
	
}
