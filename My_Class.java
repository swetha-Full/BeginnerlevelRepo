package employee;
class Outer_Demo {
	   int num;
	   
	   // inner class
	   private class Inner_Demo {
	      public void print() {
	         System.out.println("This is an inner class");
	      }
	   }
	   
	   // Accessing he inner class from the method within
	   void display_Inner() {
	      Inner_Demo inner = new Inner_Demo();
	      inner.print();
	   }
	}
public class My_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Outer_Demo outer = new Outer_Demo();
	      
	      // Accessing the display_Inner() method.
	      outer.display_Inner();
	}

}
