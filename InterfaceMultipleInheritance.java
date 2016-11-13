/* Multiple Inheritance using Interfaces */


package niit;

interface Printable{  
void print();  
}  
  
interface Showable{  
void show();  
}  
  

public class InterfaceMultipleInheritance implements Printable,Showable{

	public void print(){System.out.println("Hello");}  
	public void show(){System.out.println("Welcome");}  
	  
	public static void main(String args[]){  
	InterfaceMultipleInheritance obj = new InterfaceMultipleInheritance();  
	obj.print();  
	obj.show();  
	 }  

}
