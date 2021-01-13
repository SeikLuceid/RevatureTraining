package com.revature.day03.assignment01;

public abstract class Animal {
	String picture = "A nice picture of an animal.";
	String food = "whatever it needs to survive.";
	float hunger = 0.0f;
	String boundaries = "it's designated area.";
	String location = "it's specific location.";
	String sound = "sound form of distinct noise.";
	
	
	public abstract void makeNoise();
	
	public abstract void eat();
	
	public void sleep()
	{
		System.out.println("The animal sleeps in " + location);
	}
	
	public void roam()
	{
		System.out.println("the animal roams around " + boundaries);
	}
}
