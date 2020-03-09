//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Laboratory Exercise #5
//	File Name:		SortComparison.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221

import java.text.DecimalFormat;
import org.uofm.tools.CreateCustomArray;
import org.uofm.tools.ProgramHelper;
import org.uofm.tools.SortingAlgorithms;

/**
 * Sort example class that will demonstrate
 * the differences in comparison time between
 * a Bubble Sort and a Selection Sort.
 * 
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />Herff College of Engineering
 * <br />The University of Memphis
 * @since 1.0
 */
public class SortComparison
{
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	create objects of the required classes for this program...
		ProgramHelper pH = new ProgramHelper();
		SortingAlgorithms sA = new SortingAlgorithms();
		CreateCustomArray cCA = new CreateCustomArray();
		//	set the size of the array...
		int size = 300000;
		//	formatter used to display long numbers with commas...
		DecimalFormat df = new DecimalFormat("#,###");
		//	describe the program to the user...
		pH.ProgramDescription();
		//	add line spacing...
		System.out.println();
		
		//	calculate the number of comparisons to be made...
		
		//	display the number of comparisons to the user...
		
		
		
		//	create the random int array...
		int[] randomIntArray = cCA.CreateRandomIntArray(size);
		
		//	get the current timestamp before starting the method...
		long startTime = System.currentTimeMillis();
		//	call the bubble sort method...
		SortingAlgorithms.BubbleSort(randomIntArray);

		//	get the current timestamp after finishing the method...
		
		
		//	calculate the total time...
		
		
		//	display execution time for the bubble sort...
		
		
		//	get the current timestamp before starting the method...
		
		//	call the bubble sort method...
		
		//	get the current timestamp after finishing the method...
		
		
		//	calculate the total time...
		
		
		//	display execution time for the selection sort...
		
		
		//	create a new instance of the DecimalFormat class
		//	for displaying two digit precision...
		
		//	calculate the increase / decrease effeciency of selection sort
		//	versus bubble sort...
		
		//	display increase / decrease effeciency to user...
		
		
		//	add line spacing...
		
		//	display developer information...
		
	}
	
	/**
	 * Method used to calculate the number
	 * of comparisons for a sort.
	 * @param elements
	 * @return number of calculations
	 */
	public static long CalculateNumberOfComparisons(long elements)
	{
		
		return elements;
	}
}
