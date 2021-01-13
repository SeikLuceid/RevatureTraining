package com.revature.day03.assignment01;

public class Cat extends Feline 
{
	public Cat()
	{
		hunger = 0.25f;
		food = "Cat Food.";
		sound = "meows at you expectently.";
	}
	
	@Override
	public void makeNoise() 
	{
		System.out.println("The cat " + sound);
	}

	@Override
	public void eat() 
	{
		hunger = 0.1f;
		System.out.println("The cat's hunger is above (" + hunger + "), so nibbles on " + food);
	}
}
