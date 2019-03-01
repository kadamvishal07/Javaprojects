package Abstraction;

public abstract class Bike
{
	abstract String model();
}

class Honda extends Bike
{
	@Override
	String model() 
	{
		return "Shine";
	}
	
}

class Hero extends Bike
{
	@Override
	String model() 
	{
		return "CBZ";
	}
	
}

class Bajaj extends Bike
{
	@Override
	String model() 
	{
		return "Pulsor";
	}
	
}

