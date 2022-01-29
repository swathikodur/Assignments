interface Animal{
	public void animalSound();
	public void sleep();
}
class Dog implements Animal
{
	public void animalSound() 
	{
		System.out.println("Dog says bow bow");
		
	}
	public void sleep()
	{
		System.out.println("Sleeping");
	}
}
public class Interface_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog d=new Dog();
    d.animalSound();
    d.sleep();
	}

}



