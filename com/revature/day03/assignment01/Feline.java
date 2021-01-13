package com.revature.day03.assignment01;

public abstract class Feline extends Animal 
{
	public Feline()
	{
		boundaries = "around apartment.";
	}
	
	@Override
	public void roam()
	{
		System.out.println("The feline roams about idly " + boundaries);
	}
}
