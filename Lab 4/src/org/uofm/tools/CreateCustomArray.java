package org.uofm.tools;

import java.util.Random;

public class CreateCustomArray 
{
	// allow this method to take a custom size when called...
	public static int[] CreateRandomIntArray(int size)
	{
		try
		{
		// create and instance of the random class for future use.
		Random rA = new Random();
		//define an int array and base the index on the size given when called...
		int[] randomIntArray = new int[size];
		//generally use a for loop to interact with the elements in an array...
		for(int i=0; i<randomIntArray.length; i++)
		{
			// to limit random number generator to a specific size, use something like
			// nextType((max - min) + 1) + min;
			int RandomNumber = rA.nextInt((100 - 0) + 1) + 0;
			//store those generated numbers in the array. 
			randomIntArray[i] = RandomNumber;
			
			
		}
			return randomIntArray;
		}
		catch (Exception exc)
		{
			return(null);
		}
		//Once finished, return the array for use in other classes!
		
	}

}
