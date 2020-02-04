//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Lab 1
//	File Name:		ReverseArray.java
//	Developer:		Cameron Hall
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
// This program creates and fill an array with random
// numbers which it then sorts in ascending and descending
// order to assist in finding duplicate numbers and present
// those to the user.

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{	
		// describe the project to the user.
		org.uofm.tools.ProgramHelper.ProjectDescription();
		//initialize the random array using the methods created...
		int[] randomArray = org.uofm.tools.CreateCustomArray.CreateRandomIntArray(45);
		// sort the random numbers in ascending order first so it can be reversed later...
		Arrays.sort(randomArray);
		//create a flag to note if a duplicate is found or not...
		int dupeflag = 0;
		// adding white space
		System.out.println();
		System.out.print("The sorted random array contains: ");
		
		// use a for loop to reverse and display the array..
		for(int a=randomArray.length - 1; a>0; a--)
		{
			System.out.print(+randomArray[a]+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Duplicates found in the sorted array: ");
		System.out.println();
		// use another for loop to compare local elements to determine if there are duplicates
		// this is easy because duplicates will always be next to each other due to the array being sorted.
		for(int i=0; i<randomArray.length; i++)
		{
			for(int j=i+1; j<randomArray.length; j++)
			if(randomArray[i] == randomArray[j])
			{
				dupeflag = 1;
				System.out.println(randomArray[i]+ " is a duplicate." );
				// if duplicates are found set this flag to show it...
			}

		}
		// if nothing was found, the flag will remain false and a message will be shown to indicate this...	
		if(dupeflag == 0)
		{
			System.out.println("No duplicates found?!");
		}
		// add some white space and display developer info...
		System.out.println();
		System.out.println();
		org.uofm.tools.ProgramHelper.DeveloperInformation();
		
	}

}
