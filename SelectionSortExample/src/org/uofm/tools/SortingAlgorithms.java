package org.uofm.tools;

import java.text.DecimalFormat;

/**
 * Class that contains sorting algorithms
 * covered in TECH 2261 for Spring 2020.
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
		long loopCount = 0;
		long swaps = 0;
		int temp;
		
		for(int i=0; i < data.length; i++)
		{
			for(int j=1; j < data.length-i; j++)
			{
				loopCount++;
				
				if(data[j-1] > data[j])
				{
					temp = data[j-1];
					data[j-1] = data[j];
					data[j] = temp;
					swaps++;
				}
			}
		}
		
		//	display the actual number of comparisons made...
		System.out.println("Number of comparisons made:  " + df.format(loopCount));
		//	display the actual number of swaps made...
		System.out.println("Number of swaps made:  " + df.format(swaps));
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



