package com.revature.day03.assignment01;

public abstract class Canine extends Animal 
{
	public Canine()
	{
		boundaries = "the extremely small area that is the yard.";
	}
	
	@Override
	public void roam()
	{
		System.out.println("The canine roams " + boundaries + " and seeks entertainment.");
	}
}
