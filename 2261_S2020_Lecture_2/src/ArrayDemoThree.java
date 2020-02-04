//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		In Class Demo
//	File Name:		ArrayDemoThree.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Program that demonstrates the use of
//	char arrays in Java, specifically 
//	declaring, defining, and methods useful
//	for printing the contents to the
//	console.

import java.util.Arrays;

public class ArrayDemoThree
{
	public static void main(String[] args)
	{
		//	declare and define a char array...
		char[] charArray = new char[5];
		
		//	now let's define the char array by
		//	defining some data for each element...
		charArray[0] = 'a';
		charArray[1] = 'b';
		charArray[2] = 'c';
		charArray[3] = 'd';
		charArray[4] = 'e';
		
		//	wrong way to print out an array.  what is the output?
		//	every object has a 'toString()' method, and the default output
		//	is to display the objects class name representation, followed
		//	by the '@' symbol, then the hashcode.  In this example, you 
		//	would see something similar to this:
		//	[C@139a55
		//	notice that for a non-String array, we have to explicitly
		//	call the 'toString()' method...
		System.out.print("Just printing the array:          ");
		
		System.out.println(charArray.toString());
		
		//	this is valid, however it will print out the contents
		//	of the entire array, delimited by a ',' (comma) and
		//	enclosed within brackets.  In this example, you should see
		//	something similar to this:
		//	[a, b, c, d, e]
		System.out.print("Using the Arrays class:           ");
		
		System.out.println(java.util.Arrays.toString(charArray));
		
		//	in reality, the best way to print out an array is to
		//	loop through each of the elements defined within it
		//	limited by the size of the array...
		System.out.print("Loop through the array:           ");
		
		for(int a=0; a<charArray.length; a++)
		{
			System.out.print(charArray[a]);
		}
		
		System.out.println();
		
		//	we can print out the array contents by using
		//	an enhanced loop in Java...
		System.out.print("Enhanced loop through the array:  ");
		
		for(char c: charArray)
		{
			System.out.print(c);
		}
		
		System.out.println();
		
		//	we can print out the array contents by converting
		//	the data (which is stored as a primitive type) into
		//	a List...
		System.out.print("Loop through the List:            ");
		Arrays.asList(charArray).stream().forEach(s -> System.out.print(s));
	}
}
