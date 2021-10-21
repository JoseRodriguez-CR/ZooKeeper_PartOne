package PartOne;

public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("throwing stuff here");
		energyLevel -= 5;
		//System.out.println(energyLevel);
		displayEnergy();
	}
	public void eatBanana() {
		System.out.println("eating bananas");
		energyLevel += 10;
		//System.out.println(energyLevel);
		displayEnergy();
	}
	public void climb() {
		System.out.println("climbing stuff here");
		energyLevel -= 10;
		//System.out.println(energyLevel);
		displayEnergy();
	}
}