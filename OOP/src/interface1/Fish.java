package interface1;

public class Fish implements Prey, Predator{

	@Override
	public void hunt() {
		System.out.println("Hunting fish");
		
	}

	@Override
	public void flee() {
		System.out.println("Hunted fish");
		
	}
	

}
