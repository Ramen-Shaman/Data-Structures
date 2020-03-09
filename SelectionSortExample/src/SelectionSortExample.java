import java.text.DecimalFormat;

import org.uofm.tools.CreateCustomArray;
import org.uofm.tools.SortingAlgorithms;

public class SelectionSortExample
{
	public static void main(String[] args)
	{
		CreateCustomArray cca = new CreateCustomArray();
		SortingAlgorithms sa = new SortingAlgorithms();
		//int arraySize = 20000;
		int arraySize = 5;
		
		long comparisons = CalculateNumberOfComparisons(arraySize);
		System.out.println("Number of comparisons calculated:  " + comparisons);
		
		//int[] testArray = cca.CreateRandomIntArray(arraySize);
		int[] testArray = {36,12,3,9,27};
		System.out.print("Unsorted Array:  ");
		for(int i: testArray)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//	get the current timestamp before starting the method...
		//long startTime = System.currentTimeMillis();
		//	call the bubble sort method...
		int[] sortResult = sa.SelectionSort(testArray);
		//	get the current timestamp after finishing the method...
		//long endTime = System.currentTimeMillis();
		
		//	calculate the total time...
		//long ssExecutionTime = endTime - startTime;
		
		//System.out.println("Selection Sort Total execution time:  " + ssExecutionTime + " (milliseconds)");
		
		System.out.print("Sorted Array:  ");
		for(int i: sortResult)
		{
			System.out.print(i + " ");
		}
	}

	public static long CalculateNumberOfComparisons(long elements)
	{
		long result = (elements*(elements-1))/2;
		return(result);
	}
}
