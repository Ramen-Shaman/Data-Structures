//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Laboratory Exercise #5
//	File Name:		SortComparison.java
//	Developer:		Cameron Hall
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
 * @author Cameron L. Hall
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
		long comparisons = 0;
		
		//	set the size of the array...
		int size = 300000;
		
		//	formatter used to display long numbers with commas...
		DecimalFormat df = new DecimalFormat("#,###");
		
		//	describe the program to the user...
		pH.ProgramDescription();
		
		//	add line spacing...
		System.out.println();
		
		//	calculate the number of comparisons to be made...
		comparisons = CalculateNumberOfComparisons(size);
		//	display the number of comparisons to the user...
		
		System.out.println("Number of comparisons calculated for a "+df.format(size)+" element array: " +df.format(comparisons));
		
		//	create the random int array...
		int[] randomIntArray = cCA.CreateRandomIntArray(size);
		
		//	get the current timestamp before starting the method...
		long startTime = System.currentTimeMillis();
		//	call the bubble sort method...
		SortingAlgorithms.BubbleSort(randomIntArray);

		//	get the current timestamp after finishing the method...
		long endTime = System.currentTimeMillis();
		
		//	calculate the total time...
		long executionTime = endTime - startTime;
		
		//	display execution time for the bubble sort...
		System.out.println("Bubble Sort Total Execution time: "+executionTime+" (miliseconds)");
		
		//	get the current timestamp before starting the method...
		long sortStartTime = System.currentTimeMillis();
		//	call the selection sort method...
		sA.SelectionSort(randomIntArray);
		//	get the current timestamp after finishing the method...
		long sortEndTime = System.currentTimeMillis();
		
		//	calculate the total time...
		long sortExecutionTime = sortEndTime - sortStartTime;
		
		//	display execution time for the selection sort...
		System.out.println("Selection Sort Total Execution time: "+sortExecutionTime+" (miliseconds)");
		
		//	create a new instance of the DecimalFormat class
		//	for displaying two digit precision...
		DecimalFormat digitdf = new DecimalFormat("###.##%");
		//	calculate the increase / decrease effeciency of selection sort
		//	versus bubble sort...
		float efficiency = (executionTime-sortExecutionTime);
		efficiency = efficiency/executionTime;
		
		//	display increase / decrease efficiency to user...
		System.out.println("Efficiancy Increase: "+digitdf.format(efficiency));
		
		//	add line spacing...
		System.out.println();
		
		//	display developer information...
		pH.DeveloperInformation();
	}
	
	/**
	 * Method used to calculate the number
	 * of comparisons for a sort.
	 * @param elements
	 * @return number of calculations
	 */
	public static long CalculateNumberOfComparisons(long elements)
	{
		elements = (elements *(elements -1))/2;
		return(elements);
	}
}
