//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Lecture 7-1.2
//	File Name:		SelectionSortExampleTwo.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Example program that shows the
//	efficiency of the selection
//	sort.

import org.uofm.tools.CreateCustomArray;
import org.uofm.tools.SortingAlgorithms;
import java.text.DecimalFormat;

public class SelectionSortExampleTwo
{
	public static void main(String[] args)
	{
		//	create an object of the CreateCustomArray class...
		CreateCustomArray cca = new CreateCustomArray();
		//	create an object of the SortingAlgorithms class...
		SortingAlgorithms sa = new SortingAlgorithms();
		//	define the array size...
		int arraySize = 20000;
		//	formatter used to display long numbers with commas...
		DecimalFormat df = new DecimalFormat("#,###");
		
		//	calculate the number of comparisons to be made...
		long comparisons = CalculateNumberOfComparisons(arraySize);
		//	display the number of comparisons to the user...
		System.out.println("Number of comparisons calculated for a " + 
							df.format(arraySize) + " element array:  " + 
							df.format(comparisons));
		
		//	create the random int array...
		int[] testArray = cca.CreateRandomIntArray(arraySize);

		//	get the current timestamp before starting the method...
		long startTime = System.currentTimeMillis();
		//	call the bubble sort method...
		int[] sortResult = sa.SelectionSort(testArray);
		//	get the current timestamp after finishing the method...
		long endTime = System.currentTimeMillis();
		
		//	calculate the total time...
		long ssExecutionTime = endTime - startTime;
		
		//	display the time measured based on the number of
		//	elements contained within the int array...
		System.out.println("Selection Sort Total execution time:  " + ssExecutionTime + " (milliseconds)");
	}

	/**
	 * Method used to calculate the number
	 * of comparisons to be made on a given
	 * array.
	 * @param elements
	 * @return number of calculations
	 */
	public static long CalculateNumberOfComparisons(long elements)
	{
		long result = (elements*(elements-1))/2;
		return(result);
	}
}
