import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Array List = a resizable array
		// Elements can be added and removed after comilation phase store reference data types
       
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList<String>(); // <>  storing strings, ints
		/*
		food.add("pizza");
		food.add("hamburger");
		food.add("doner");
		
		food.set(0, "sushi");
		food.remove(1);
		food.clear();
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		*/
		
		// 2D AL = a dynamic list of lists, their size can be changed during runtime
		
		bakeryList.add("pasta");
		bakeryList.add("pizza");
		bakeryList.add("domatito");
		
		
		
		ArrayList<String> produceList = new ArrayList<String>();
		
		produceList.add("peppers");
		produceList.add("zucchini");
		produceList.add("domatito2");
		
        ArrayList<String> drinksList = new ArrayList<String>();
		
		drinksList.add("cola");
		drinksList.add("hell");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(0).get(1));
		
		// for-each loop = traversing technique to iterate through the elements in an array/collection
		//                 less steps, more readable, less flexible
		
		// String[] animals = {"cat", "dog"...};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("bat");
		
		for(String i: animals) {
			System.out.println(i);
		}
		
		
	}

}
