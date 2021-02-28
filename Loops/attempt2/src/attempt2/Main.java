package attempt2;

import java.util.Scanner;

public class Main {
     
	public static void main(String[] args) {
		//if
		
		 int age = 18;
		 
		 if(age>=75) {
			 System.out.println("You are and adult");
		 } else if(age>=18) {
			 System.out.println("Boomer");
		 } else {
			 System.out.println("Youngster");
		 } 
		//switch
			
		String day = "Friday";
		switch(day) {
		case "Sunday": System.out.println("It is Sunday");
		break;
		case "Monday": System.out.println("It is Monday");
		break;
		case "Friday": System.out.println("It is Sunday");
		break;
		default: System.out.println("Not a day");
		}
		
		// logical operators
		
		int temp = 24;
		
		if(temp>30) {
			System.out.println("Hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("Warm outside");
		}
		else {
			System.out.println("Cold outside");
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the gane");
		}
		else {
			System.out.println("You are still playing");
		}
		
		// while loop
		
		String name = "";
		do {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isBlank());
		System.out.println("Hello "+name);
		
		// for loop
		for(int i = 0; i<=10; i++) {
			System.out.println(i);
		}
		// nested loops
		
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use");
		symbol = scanner.next();
		
		for(int i = 1; i<= rows; i++) {
			System.out.println();
			for(int j = 1; j<=columns; j++) {
				System.out.println(symbol);
			}
		}
		
		 }
	}


