package exam;

import java.util.HashMap;

class Car{
	String name;
	public Car() {}
	public Car(String name) {
		this.name =name;
	}
}

class CarFactory{
	private static CarFactory instance = new CarFactory();
	//핵심부분 싱글톤(single)
	HashMap<String,Car> carMAp =new HashMap<>();
	
	private CarFactory() {}
	public static CarFactory getInstance(){
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	public Car createCar(String name) {
		if(carMAp.containsKey(name)) {
			return carMAp.get(name);
		}
		Car car = new Car ();
		carMAp.put(name, car);
		return car;
	}
	
	
}
public class Exam6 {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		
		Car sonata1 =new factory.createCar("은차");
		Car sonata2 =new factory createCar("은차");
		System.out.println(sonata1 == sonata2); //true
		
		Car avante1 =new factory.createCar("박차");
		Car avante2 =new factory createCar("박차");
		System.out.println(avante1 == avante2); //true
		
		System.out.println(sonata1 == avante1);
	}

}
