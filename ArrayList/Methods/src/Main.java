
public class Main {

	public static void main(String[] args) {
		// method = a block of code that is executed whenever it is called upon
        // overloaded methods = methods that share the same name but ahve different params
       /*
		String name = "Zues";
       int age = 20;
       hello(name, age);
       
       int x = 3;
       int y = 6;
       
       //int z = add(x,y);
       
       System.out.println(add(x,y));
	}
	static void hello(String name, int age) {
		System.out.println("Hi "+ name);
		System.out.println("You are "+ age);
	}
	
	static int add(int x, int y) {
		//int z = x + y;
		//return z;
		
		return x + y;
		*/
		
		int x = add(1,3);
		System.out.println(x);
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	

}
