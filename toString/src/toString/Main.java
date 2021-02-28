package toString;

public class Main {

	public static void main(String[] args) {
		// toString() = special method that all objects inherit, that returns a string that
		//  "textually represents" an object. can be used both implicitly and explicitly
		//Car car = new Car();
		
		// System.out.println(car.toString());
		//System.out.println(car);
		//-------------------------------------------------
		// array of objects
		
		//Food[] refrigerator = new Food[3];
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("doner");
		Food food3 = new Food("ham");
		
		Food[] refrigerator = {food1, food2, food3};
		/*
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		*/
		System.out.println(refrigerator[0].name);
	}

}
