//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Lecture 7-1.1
//	File Name:		SelectionSortExampleOne.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Example program that shows the
//	inner workings of the selection
//	sort.

import org.uofm.tools.SortingAlgorithms;
import java.text.DecimalFormat;

/**
 * SelectionSortExample class demonstrating
 * the effects of a selection sort.
 * 
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />Herff College of Engineering
 * <br />The University of Memphis
 * @since 1.0
 */
public class SelectionSortExampleOne
{
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	create an object of the SortingAlgorithms class...
		SortingAlgorithms sa = new SortingAlgorithms();
		//	define the array size...
		int arraySize = 5;
		//	formatter used to display long numbers with commas...
		DecimalFormat df = new DecimalFormat("#,###");
		
		//	calculate the number of comparisons to be made...
		long comparisons = CalculateNumberOfComparisons(arraySize);
		//	display the number of comparisons to the user...
		System.out.println("Number of comparisons calculated for a " + 
							df.format(arraySize) + " element array:  " + 
							df.format(comparisons));
		
		//	declare and define the array to test...
		int[] testArray = {36,12,3,9,27};
		
		//	display the unsorted array...
		System.out.print("Unsorted Array:  ");
		for(int i: testArray)
		{
			System.out.print(i + " ");
		}
		
		//	add line spacing for clarity...
		System.out.println();
		
		//	call the selection sort method...
		int[] sortResult = sa.SelectionSort(testArray);

		//	displey the sorted array...
		System.out.print("Sorted Array:  ");
		for(int i: sortResult)
		{
			System.out.print(i + " ");
		}
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
