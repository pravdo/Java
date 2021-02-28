
public class Main {

	public static void main(String[] args) {
		// object = an instance of a class that may contain attributes and methods
        // constructor = special method that is called when an object is instantiated (created)
		// local = declared inside a method, visible only to that method
		// global = declared outside a method, but within a class visible to all parts of a class
		// overloaded constructors = multiple constructors within a class with the same name;
		//                          but have different parameters
		//-----------------------------------------------------------------
		/*
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		System.out.println();
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		
		myCar1.drive();
		myCar1.brake();
		*/
		//-------------------------------------------------
		/*
		Human human = new Human("Morty", 17, 60);
		Human human2 = new Human("Rick", 30, 60);
		
		//System.out.println(human.name);
		human2.eat();
		human.drink();
		*/
		//-----------------------------------------------------------
		//DiceRoller diceRoller = new DiceRoller();
		//---------------------------------------------------------------
		
		Pizza pizza = new Pizza("thicc crust", "tomato", "chicken","pepperoni");
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.meat);
		System.out.println(pizza.topping);
	}

}
