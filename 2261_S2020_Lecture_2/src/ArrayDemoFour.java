//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		In Class Demo
//	File Name:		ArrayDemoFour.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Program that demonstrates the use of
//	int arrays in Java, specifically 
//	declaring, defining, and methods useful
//	for printing the contents to the
//	console.

public class ArrayDemoFour
{
	public static void main(String[] args)
	{
		//	declare, define, and assign an array...
		int[] intArray = {5,1,9,7,3};
		
		//	wrong way to print out an array.  what is the output?
		//	every object has a 'toString()' method, and the default output
		//	is to display the objects class name representation, followed
		//	by the '@' symbol, then the hashcode.  In this example, you 
		//	would see something similar to this:
		//	[I@139a55
		//	notice that for a non-String array, we have to explicitly
		//	call the 'toString()' method...
		System.out.print("Just printing the array:          ");
		
		System.out.println(intArray.toString());
		
		//	this is valid, however it will print out the contents
		//	of the entire array, delimited by a ',' (comma) and
		//	enclosed within brackets.  In this example, you should see
		//	something similar to this:
		//	[5, 1, 9, 7, 3]
		System.out.print("Using the Arrays class:           ");
		
		System.out.println(java.util.Arrays.toString(intArray));
		
		//	in reality, the best way to print out an array is to
		//	loop through each of the elements defined within it
		//	limited by the size of the array...
		System.out.print("Loop through the array:           ");
		
		for(int a=0; a<intArray.length; a++)
		{
			System.out.print(intArray[a]);
		}
		
		System.out.println();
		
		//	we can print out the array contents by using
		//	an enhanced loop in Java...
		System.out.print("Enhanced loop through the array:  ");
		
		for(int i: intArray)
		{
			System.out.print(i);
		}
		
		System.out.println();
		
		//	we cannot use primitive types such as int as parameters
		//	to generic classes in Java...
		//System.out.print("Loop through the List:            ");
		//Arrays.asList(intArray).stream().forEach(s -> System.out.print(s));
	}
}
