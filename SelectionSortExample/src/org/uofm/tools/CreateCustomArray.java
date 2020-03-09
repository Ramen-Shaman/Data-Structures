package org.uofm.tools;

import java.util.Random;

public class CreateCustomArray
{
	public int[] CreateRandomIntArray(int max)
	{
		try
		{
			Random randomGenerator = new Random();
			
			int[] intArray = new int[max];
			
			for (int a = 0; a < max; a++)
			{
				intArray[a] = randomGenerator.nextInt(100);
		    }
			
			return(intArray);
		}
		catch(Exception exc)
		{
			return(null);
		}
	}
}


