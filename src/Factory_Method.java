abstract class Car{
	    abstract void cost();
	    abstract void milage();
	    void start()
	    {
	    	System.out.println("Starts with key");
	    }
}	
		
class Audi extends Car{
	void cost() {
		System.out.println("Audi cost is 40L");
	}
	void milage() {
		System.out.println("Audi milage is 15K");
	}
}
class Bmw extends Car{
	void cost() {
		System.out.println("Bmw cost is 50L");
	}
	void milage() {
		System.out.println("Bmw milage is 10K");
	}
}
 class CarFactory{
	 
	static Car getCar(String carName) {
		 if(carName.equals("Audi"))
			 return new Audi();
		 else if(carName.equals("BMW"))
			 return new Bmw();
		 else
			 return null;
	 }
 }
public class Factory_Method{  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//CarFactory cf=new CarFactory();
	
	Car x=CarFactory.getCar("Audi");
	x.cost();
	x.milage();
	x.start();
	
	}
   }



