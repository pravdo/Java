package toString;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "blue";
    int year = 2012;
    
    public String toString() {
    	
    	String myString = make + "\n"+model+ "\n" + color+"\n"+year;
    	return myString;
    }
}
