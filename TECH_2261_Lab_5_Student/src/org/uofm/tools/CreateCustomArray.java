package org.uofm.tools;

//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Laboratory Exercise #5
//	File Name:		CreateCustomArray.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221

import java.util.Random;

/**
 * Class used to create custom arrays.
 * 
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />Herff College of Engineering
 * <br />The University of Memphis
 * @since 1.0
 */
public class CreateCustomArray
{
	/**
	 * Method used to create a random
	 * integer array based on the size
	 * requested.
	 * @param max
	 * @return
	 */
	public int[] CreateRandomIntArray(int max)
	{
		try
		{
			//	create an object of the Random class...
			Random randomGenerator = new Random();
			//	create an int array based on max elements...
			int[] intArray = new int[max];
			
			//	populate the int array with random numbers...
			for (int a = 0; a < max; a++)
			{
				intArray[a] = randomGenerator.nextInt(100);
		    }
			
			//	return the filled array...
			return(intArray);
		}
		catch(Exception exc)
		{
			//	if we have an exception, return null...
			return(null);
		}
	}
}


