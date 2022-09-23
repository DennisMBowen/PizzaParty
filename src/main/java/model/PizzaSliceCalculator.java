package model;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Sep 20, 2022
 */

public class PizzaSliceCalculator {
	
	private int numberOfPeople;
	private int numberOfPizzaPies;
	private int slicesPerPie;
	private int slicesPerPerson;
	private int leftoverSlices;
	
	public PizzaSliceCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PizzaSliceCalculator(int numberOfPeople, int numberOfPizzaPies) {
		super();
		this.numberOfPeople = numberOfPeople;
		this.numberOfPizzaPies = numberOfPizzaPies;
		this.slicesPerPie = 8;
		this.slicesPerPerson = calculateSlicesPerPerson();
		this.leftoverSlices = calculateLeftoverSlices();
	}
	
	public int getSlicesPerPerson() {
		return slicesPerPerson;
	}

	public void setSlicesPerPerson(int slicesPerPerson) {
		this.slicesPerPerson = slicesPerPerson;
	}

	public int getLeftoverSlices() {
		return leftoverSlices;
	}

	public void setLeftoverSlices(int leftoverSlices) {
		this.leftoverSlices = leftoverSlices;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public int getNumberOfPizzaPies() {
		return numberOfPizzaPies;
	}

	public void setNumberOfPizzaPies(int numberOfPizzaPies) {
		this.numberOfPizzaPies = numberOfPizzaPies;
	}

	public int getSlicesPerPie() {
		return slicesPerPie;
	}

	public void setSlicesPerPie(int slicesPerPie) {
		this.slicesPerPie = slicesPerPie;
	}

	public int calculateSlicesPerPerson() {
		return (this.numberOfPizzaPies * this.slicesPerPie / this.numberOfPeople);
	}
	
	public int calculateLeftoverSlices() {
		return (this.numberOfPizzaPies * this.slicesPerPie % this.numberOfPeople);
	}

	@Override
	public String toString() {
		return "PizzaSliceCalculator [numberOfPeople=" + numberOfPeople + ", numberOfPizzaPies=" + numberOfPizzaPies
				+ ", slicesPerPie=" + slicesPerPie + ", slicesPerPerson=" + slicesPerPerson + ", leftoverSlices="
				+ leftoverSlices + "]";
	}

	
	
	
	
	
	

}
