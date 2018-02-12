package employee;

class Parent{
	String name;
	Parent(String name) 
    {
        this.name = name;
    }
     
    public String getParentName()
    {
        return this.name;
    } 
}
class Daughter extends Parent{

	Daughter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
}
public class SuperKey_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Daughter d=new Daughter("Shankar");
d.getParentName();
	System.out.print("my daddy's name is "+ d.name);
	}

}
