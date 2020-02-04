//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		In Class Demo
//	File Name:		ArrayDemoOne.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Program that demonstrates the use of
//	arrays in Java, specifically using the
//	copyOf, sort, and binarySearch methods
//	of the Arrays class.

import java.util.Arrays;

public class ArrayDemoOne
{
	public static void main(String[] args)
	{
		//	declare a simple integer array...
		int[] intArray = {23,88,51,63,99,72,18,64,84,19,26,3,49,8};

		//	print out the original array...
		System.out.println("Contents of the original array:\n");
		
		for(int a=0; a<intArray.length; a++)
		{
			System.out.println("Index [" + a + "] of the array contains " + intArray[a]);
		}
		
		//	add a blank line...
		System.out.println();
		
		//	let's make a copy of the array...
		int intArrayCopy[] = Arrays.copyOf(intArray, intArray.length);
		
		//	now, print out the sorted array...
		System.out.println("Contents of the copied array:\n");
		
		for(int b=0; b<intArrayCopy.length; b++)
		{
			System.out.println("Index [" + b + "] of the array copy contains " + intArrayCopy[b]);
		}
		
		//	add a blank line...
		System.out.println();
		
		//	display the size of the array...
		System.out.println("The array 'intArray' has " + intArray.length + " elements.");
		
		//	display the size of the array...
		System.out.println("The array 'intArrayCopy' has " + intArrayCopy.length + " elements.");
		
		//	add a blank line...
		System.out.println();
		
		//	let's sort this original array...
		Arrays.sort(intArray);
		
		//	now, print out the original sorted array...
		System.out.println("Contents of the original array after sorting:\n");
		
		for(int c=0; c<intArray.length; c++)
		{
			System.out.println("Index [" + c + "] of the array contains " + intArray[c]);
		}
		
		//	add a blank line...
		System.out.println();
		
		//	let's search for the position of a specific number using the binary search method...
		int indexOfValue = Arrays.binarySearch(intArray, 23);
		System.out.println("The value 23 is found at position " + indexOfValue + " of the original sorted array.");
		
		//	add a blank line...
		System.out.println();
		
		//	let's search for the position of a specific number using the binary search method...
		indexOfValue = Arrays.binarySearch(intArrayCopy, 72);
		System.out.println("The value 72 is found at position " + indexOfValue + " of the copied array.");
		
		//	add a blank line...
		System.out.println();
		
		//	hmmm, we seem to have a problem here.  we got a negative value returned when we can clearly see that
		//	the value 72 is at position 5.  what the what???  Well - we can't use a binary search on an unsorted
		//	array.  Weird, huh?  But that's the law, so we have to adapt.
		//	let's sort the copied array and see what happens:
		Arrays.sort(intArrayCopy);
		
		//	now, print out the original sorted array...
		System.out.println("Contents of the copied array after sorting:\n");
		
		for(int d=0; d<intArray.length; d++)
		{
			System.out.println("Index [" + d + "] of the array contains " + intArray[d]);
		}
		
		//  add a blank line...
		System.out.println();
		
		//	now let's try it again...
		indexOfValue = Arrays.binarySearch(intArrayCopy, 72);
		System.out.println("The value 72 is found at position " + indexOfValue + " of the copied array.");
	}

}
