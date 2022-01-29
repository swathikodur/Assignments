abstract class Bike{
	   abstract void brake();
}
class Duke extends Bike
{
	public void brake()
	{
		System.out.println("Duke bike");
	}
}
class Fz extends Bike
{
	public void brake()
	{
		System.out.println("Fz bike");
	}
}
public class Abstract_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Duke d1=new Duke();
    d1.brake();
    Fz f1=new Fz();
    f1.brake();
	}

}

