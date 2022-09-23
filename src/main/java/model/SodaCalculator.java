package model;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Sep 22, 2022
 */

public class SodaCalculator {
	
	private int numberOfPeople;
	private int numberOfTwelvePacks;
	private int sodaPerPack;
	private int sodaPerPerson;
	private int leftoverSoda;
	
	public SodaCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SodaCalculator(int numberOfPeople, int numberOfTwelvePacks) {
		super();
		this.numberOfPeople = numberOfPeople;
		this.numberOfTwelvePacks = numberOfTwelvePacks;
		this.sodaPerPack = 12;
		this.sodaPerPerson = calculateSodaPerPerson();
		this.leftoverSoda = calculateLeftoverSoda();
	}

	private int calculateLeftoverSoda() {
		// TODO Auto-generated method stub
		return this.numberOfTwelvePacks * this.sodaPerPack % this.numberOfPeople;
	}

	private int calculateSodaPerPerson() {
		// TODO Auto-generated method stub
		return this.numberOfTwelvePacks * this.sodaPerPack / this.numberOfPeople; 
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public int getNumberOfTwelvePacks() {
		return numberOfTwelvePacks;
	}

	public void setNumberOfTwelvePacks(int numberOfTwelvePacks) {
		this.numberOfTwelvePacks = numberOfTwelvePacks;
	}

	public int getSodaPerPack() {
		return sodaPerPack;
	}

	public void setSodaPerPack(int sodaPerPack) {
		this.sodaPerPack = sodaPerPack;
	}

	public int getSodaPerPerson() {
		return sodaPerPerson;
	}

	public void setSodaPerPerson(int sodaPerPerson) {
		this.sodaPerPerson = sodaPerPerson;
	}

	public int getLeftoverSoda() {
		return leftoverSoda;
	}

	public void setLeftoverSoda(int leftoverSoda) {
		this.leftoverSoda = leftoverSoda;
	}

	@Override
	public String toString() {
		return "SodaCalculator [numberOfPeople=" + numberOfPeople + ", numberOfTwelvePacks=" + numberOfTwelvePacks
				+ ", sodaPerPack=" + sodaPerPack + ", sodaPerPerson=" + sodaPerPerson + ", leftoverSoda=" + leftoverSoda
				+ "]";
	}
	

}
