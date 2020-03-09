package org.uofm.tools;

//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Laboratory Exercise #4
//	File Name:		SortingAlgorithms.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221

import java.text.DecimalFormat;

public class SortingAlgorithms
{
	/**
	 * Method that performs a simple
	 * bubble sort on an integer array.
	 * @param data
	 * @return
	 */
	public int[] BubbleSort(int[] data)
	{
		/********************************************************/
		/*	STUDENT TO DO:										*/
		/*														*/
		/*	The variables 'loopCount' and 'swap' are to be used	*/
		/*	within the bubble sort loop.  The student needs to	*/
		/*	determine exactly where these counters belong.		*/
		/********************************************************/
		//	formatter used to display long numbers with commas...
		DecimalFormat df = new DecimalFormat("#,###");
		long loopCount = 0;
		long swaps = 0;
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
		
		//	display the actual number of comparisons made...
		System.out.println("Number of comparisons made:  " + df.format(loopCount));
		//	display the actual number of swaps made...
		System.out.println("Number of swaps made:  " + df.format(swaps));
		return(data);
	}
}