package employee;
class Vehicle{  
void run()
{
	System.out.println("Vehicle is running");}  
}  
class Bike2 extends Vehicle{  
void run(){
	System.out.println("Bike is running safely");}  
}
public class Overriding_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//super.run();
		//Bike2 obj = new Bike2(); 
	Vehicle obj1 = new Vehicle();
		obj1.run();
		//obj.run();
		
	}

}
