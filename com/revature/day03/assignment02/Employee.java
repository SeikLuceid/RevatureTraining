package com.revature.day03.assignment02;

import java.io.Serializable;

public class Employee implements Serializable
{
	private static final long serialVersionUID = -116744082719014170L;
	
	String name;
	int id;
	
	public Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String toString()
	{
		return "ID: " + id + " | Name: " + name;
	}
}
