//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		In Class Demo
//	File Name:		ArrayDemoTwo.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Program that demonstrates the use of
//	String arrays in Java, specifically 
//	declaring, defining, and methods useful
//	for printing the contents to the
//	console.

import java.util.Arrays;

public class ArrayDemoTwo
{
	public static void main(String[] args)
	{
		//	declare a String array, but do not define it...
		String[] strArray = null;
		
		//	now let's define the String array by
		//	declaring a size (how many elements
		//	to hold) and some data for each element...
		strArray = new String[4];
		strArray[0] = "Welcome ";
		strArray[1] = "to ";
		strArray[2] = "TECH ";
		strArray[3] = "2261!";

		//	wrong way to print out an array.  what is the output?
		//	every object has a 'toString()' method, and the default output
		//	is to display the objects class name representation, followed
		//	by the '@' symbol, then the hashcode.  In this example, you 
		//	would see something similar to this:
		//	[Ljava.lang.String;@139a55
		System.out.print("Just printing the array:          ");
		
		System.out.println(strArray);
		
		//	this is valid, however it will print out the contents
		//	of the entire array, delimited by a ',' (comma) and
		//	enclosed within brackets.  In this example, you should see
		//	something similar to this:
		//	[Welcome , to , TECH , 2261!]
		System.out.print("Using the Arrays class:           ");
		
		System.out.println(java.util.Arrays.toString(strArray));
		
		//	in reality, the best way to print out an array is to
		//	loop through each of the elements defined within it
		//	limited by the size of the array...
		System.out.print("Loop through the array:           ");
		
		for(int a=0; a<strArray.length; a++)
		{
			System.out.print(strArray[a]);
		}
		
		System.out.println();
		
		//	we can print out the array contents by using
		//	an enhanced loop in Java...
		System.out.print("Enhanced loop through the array:  ");
		
		for(String s: strArray)
		{
			System.out.print(s);
		}
		
		System.out.println();
		
		//	we can print out the array contents by converting
		//	the data (which is stored as a primitive type) into
		//	a List...
		System.out.print("Loop through the List:            ");
		Arrays.asList(strArray).stream().forEach(s -> System.out.print(s));
	}
}
