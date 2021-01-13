package com.revature.day03.assignment01;

public class MainMethod {
	public static void main(String... args)
	{
		Animal[] animals = {new Cat(), new Dog(), new Hippo()};
		
		for(Animal a : animals)
		{
			a.roam();
			a.makeNoise();
			a.eat();
			a.sleep();
			System.out.println();
		}
	}
}
