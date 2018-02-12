package employee;
class Bike
{

  // declaring data members and methods

  private String color;

  private int wheels;

  public void bikeFeatures()

  {

    System.out.println("Bike Color= "+color + " wheels= " + wheels);

  }

  public void setColor(String color)

  {

    this.color = color;

  }

  public void setwheels(int wheels)

  {

    this.wheels = wheels;

  }

}
class Honda extends Bike

{

  //inherits all properties of bike class

  public void setStart()

  {

    HondaEngine e = new HondaEngine();

    e.start();

  }

}
class HondaEngine

{

  public void start()

  {

    System.out.println("Engine has been started.");

  }

  public void stop()

  {

    System.out.println("Engine has been stopped.");

  }

}
public class Composition_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h = new Honda();

	    h.setColor("Black");

	    h.setwheels(2);

	    h.bikeFeatures();

	    h.setStart();
	}

}
