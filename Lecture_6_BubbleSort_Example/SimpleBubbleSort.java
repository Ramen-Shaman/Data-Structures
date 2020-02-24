//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Lecture 6-1.1
//	File Name:		SimpleBubbleSort.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Program that demonstrates the use of a classic
//	Bubble Sorting algorithm.

public class SimpleBubbleSort
{
	public static void main(String[] args)
	{
		//	declare, define, and assign a char array
		char[] charArray = {'z','a','m','9','e','w'};

		//	display the contents of the char array...
		System.out.println("The array before bubble sort:  ");
		
		for(int a=0; a<charArray.length; a++)
		{
			System.out.print(charArray[a]);
		}
		
		//	add line space...
		System.out.println();
		
		//	perform a bubble sort on the char array...
		char[] newArray = ClassicBubbleSort(charArray);
		
		//	display the contents of the char array after the bubble sort...
		System.out.println("The array after bubble sort:  ");
		
		for(int b=0; b<newArray.length; b++)
		{
			System.out.print(newArray[b]);
		}
		
		//	add line space...
		System.out.println();
	}

	/**
	 * Method used to perform a classic
	 * Bubble Sort algorithm on a given
	 * char array.
	 * @param theArray
	 * @return the sorted array
	 */
	public static char[] ClassicBubbleSort(char[] theArray)
	{
		//	variable to hold temporary value...
		char temp;
		
		//	outer loop...
		for(int i=0; i < theArray.length; i++)
		{
			//	inner loop...
			for(int j=1; j < theArray.length-i; j++)
			{
				//	see if element [j-1] greater than element [j]...
				if(theArray[j-1] > theArray[j])
				{
					temp = theArray[j-1];			//	move [j-1] to temp variable...
					theArray[j-1] = theArray[j];	//	move [j] to [j-1]...
					theArray[j] = temp;				//	move temp value to [j]...
				}
			}
		}
		
		//	return the sorted array...
		return(theArray);
	}
}
