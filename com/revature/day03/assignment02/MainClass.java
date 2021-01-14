package com.revature.day03.assignment02;

import java.io.*;

public class MainClass 
{
	public static void main(String... args)
	{
		try 
		{
			Employee[] employees = {new Employee("Alex", 1), new Employee("Jason", 2), new Employee("Samantha", 3)};
			FileOutputStream fileOutput = new FileOutputStream(new File("F:\\serialized_employees.txt"));
			ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput);
			
			for(Employee emp : employees)
			{
				System.out.println(emp.toString());
				objOutput.writeObject(emp);
			}
			
			System.out.println();
			
			objOutput.close();
			fileOutput.close();
			
			FileInputStream fileInput = new FileInputStream(new File("F:\\serialized_employees.txt"));
			ObjectInputStream objInput = new ObjectInputStream(fileInput);
			
			for(Employee emp : employees)
			{
				Employee empObj = (Employee) objInput.readObject();
				System.out.println(emp.toString() + "\n* " + empObj.toString());
			}
			
			objInput.close();
			fileInput.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
