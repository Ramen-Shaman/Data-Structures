package org.uofm.tools;

//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Laboratory Exercise #5
//	File Name:		SortingAlgorithms.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221

import java.text.DecimalFormat;

/**
 * Class used to hold various
 * sorting algorithms.
 * 
 * @author Todd S. Canaday
 * <br />Adjunct Professor
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
	public int[] BubbleSort(int[] data)
	{
		//	formatter used to display long numbers with commas...
		DecimalFormat df = new DecimalFormat("#,###");
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
		
	}
}



