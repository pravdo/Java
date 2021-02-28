package encapsulation;

public class Main {

	public static void main(String[] args) {
		// encapsulation = attributes of a class will be hidden or private,
		// can be accessed only through methods (getters and setters)

		Car car = new Car("Audi", "A5", 2013);
		//Car car2 = new Car("Ford", "Mustang", 2018);
		
		//car2.copy(car);
		Car car2 = new Car(car);
		
		/*		
		car.setYear(2014);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		*/
		
		System.out.println(car);
		System.out.println(car2);
		System.out.println();
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}
	
	

}
