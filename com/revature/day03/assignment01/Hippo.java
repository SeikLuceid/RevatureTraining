package com.revature.day03.assignment01;

public class Hippo extends Animal
{
	public Hippo()
	{
		sound = "a bolsterous groan.";
		hunger = 0.2f;
		food = "healthy and nutrious grass.";
	}
	
	@Override
	public void makeNoise() 
	{
		System.out.println("The hippo lets out a " + sound);
	}

	@Override
	public void eat() 
	{
		System.out.println("When the hippo's hunger is (" + hunger + ") the hippo will enjoy " + food);
	}
}
