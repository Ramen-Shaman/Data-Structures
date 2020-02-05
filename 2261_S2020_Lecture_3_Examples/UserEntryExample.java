//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Lecture 3 - In Class Handout
//	File Name:		UserEntryExample.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Program that parses a user defined data file
//	and produces another data file with the appropriate
//	data delimiter.

import java.util.Scanner;

public class UserEntryExample
{
	public static void main(String[] args)
	{
		//	create an object of the Scanner class...
		Scanner keyboard = new Scanner(System.in);
		//	variable to store a string...
		String myString = "";		//	stores the input from the keyboard...
		
		//	ask the user to enter a string...
		System.out.print("Enter a string:  ");
		myString = keyboard.nextLine();
		
		//	display what the user has entered...
		System.out.println("You entered the following string:  " + myString);
	}
}
