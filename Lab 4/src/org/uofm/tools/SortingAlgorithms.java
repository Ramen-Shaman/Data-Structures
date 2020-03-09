package org.uofm.tools;

import java.text.DecimalFormat;
import java.util.Random;
import org.uofm.tools.*;

public class SortingAlgorithms 
{
	public static long loopCount = 0;
	public static long swaps = 0;

	public static int[] BubbleSort(int[] sortedArray)
	{
		
		int temp;
		
		for(int i=0; i < sortedArray.length; i++)
		{
			loopCount++;
			//	inner loop...
			for(int j=1; j < sortedArray.length-i; j++)
			{
				//	see if element [j-1] greater than element [j]...
				if(sortedArray[j-1] > sortedArray[j])
				{
					temp = sortedArray[j-1];			//	move [j-1] to temp variable...
					sortedArray[j-1] = sortedArray[j];	//	move [j] to [j-1]...
					sortedArray[j] = temp;				//	move temp value to [j]...
					swaps++;
				}
			}
		}
		return (sortedArray);
	}


	public static long CalculateNumberOfComparisons(long elements)
	{
		elements = (swaps * (swaps - 1))/2;
		
		return(elements);
	}
}

