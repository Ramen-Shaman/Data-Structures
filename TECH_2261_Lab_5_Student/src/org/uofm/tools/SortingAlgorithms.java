package org.uofm.tools;

//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Laboratory Exercise #5
//	File Name:		SortingAlgorithms.java
//	Developer:		Cameron L. Hall
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221


/**
 * Class used to hold various
 * sorting algorithms.
 * 
 * @author Cameron L. Hall
 * <br />Herff College of Engineering
 * <br />The University of Memphis
 * @since 1.0
 */
public class SortingAlgorithms
{
	/**
	 * Method that performs a simple
	 * bubble sort on an integer array.
	 * 
	 * @param data
	 * @return
	 */
	public static int[] BubbleSort(int[] data)
	{
		//	formatter used to display long numbers with commas...
		int temp;
		
		for(int i=0; i < data.length; i++)
		{
			for(int j=1; j < data.length-i; j++)
			{
				if(data[j-1] > data[j])
				{
					temp = data[j-1];
					data[j-1] = data[j];
					data[j] = temp;
				}
			}
		}
		
		return(data);
	}
	
	/**
	 * Method that performs a simple
	 * selection sort on an integer array.
	 * 
	 * @param data
	 * @return
	 */
	public int[] SelectionSort(int[] data)
	{
		for (int i = 0; i < data.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < data.length; j++)
                if (data[j] < data[index])
                    index = j;
      
            int smallerNumber = data[index]; 
            data[index] = data[i];
            data[i] = smallerNumber;
        }
		
        return data;
	}
}



