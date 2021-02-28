import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
	//	double z = Math.abs(y);  ceil, floor
	  
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypothenuse is: "+z);
		
		scanner.close();
		
		Random random = new Random();
		
		 // int x1 = random.nextInt(6)+1;
	     // double y = random.nextDouble();
	     // boolean z = random.nextBoolean();
		
		System.out.println(x);

	}

	
	

	

}
