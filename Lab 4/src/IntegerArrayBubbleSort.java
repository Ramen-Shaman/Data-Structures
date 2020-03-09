//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Laboratory Exercise #4
//	File Name:		IntegerArrayBubbleSort.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221

import java.text.DecimalFormat;
import java.util.Random;

import org.uofm.tools.CreateCustomArray;
import org.uofm.tools.ProgramHelper;
import org.uofm.tools.SortingAlgorithms;

public class IntegerArrayBubbleSort
{
	public static void main(String[] args)
	{

//		declare objects for program use...
		ProgramHelper pH = new ProgramHelper();
		int size = 50000;
		long comparisons = 0;
//		set the size of the int array to create...
		int[] randomIntArray = new int[size];
//		formatter used to display long numbers with commas...
		DecimalFormat df = new DecimalFormat("#,###");
//		describe the program to the user...
		ProgramHelper.ProjectDescription();
		//	add a line for spacing...
		System.out.println();
//		calculate the number of comparisons to be made...
		comparisons = SortingAlgorithms.CalculateNumberOfComparisons(size);
//		display the number of comparisons to the user...
		System.out.println("Number of comparisons calculated for a "+df.format(size)+" element array: " +df.format(comparisons));

//		create the random int array...
		org.uofm.tools.CreateCustomArray.CreateRandomIntArray(size);

//		get the current timestamp before starting the method...
		long startTime = System.currentTimeMillis();
//		call the bubble sort method...
		SortingAlgorithms.BubbleSort(randomIntArray);
//		get the current timestamp after finishing the method...
		long endTime = System.currentTimeMillis();

//		calculate the total time...
		long executionTime = endTime - startTime;

//		add a line for spacing...
		System.out.println();

//		display the total execution time... 

//		add a line for spacing...
		System.out.println();

//		display the developer information...
		pH.DeveloperInformation();
	}
	
	public static long CalculateNumberOfComparisons(long elements)
	{
		int size = 50000;
		elements = (size * (size-1))/2;
		return(elements);
	}
}
