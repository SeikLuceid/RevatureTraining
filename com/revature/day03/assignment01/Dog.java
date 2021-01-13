package com.revature.day03.assignment01;

public class Dog extends Canine 
{

	public Dog() 
	{
		sound = "barks loudly!";
		hunger = 0.6f;
		food = "a bowl of delicious dog food.";
	}

	@Override
	public void makeNoise() 
	{
		System.out.println("The dog " + sound);
	}

	@Override
	public void eat() 
	{
		System.out.println("When the dog's hunger is below (" + hunger + ") the dog will eat " + food);
	}
	
}
