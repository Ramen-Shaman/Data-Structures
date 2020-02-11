//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Lecture 4-1.1
//	File Name:		DelimitersExample.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Program that demonstrates the use of enumerations
//	within a program.

import org.uofm.tools.DescribeTheMonth;
import org.uofm.tools.MonthDefinition;

public class EnumerationExample
{
	public static void main(String[] args)
	{
		//	create an object of the class...
		DescribeTheMonth dtm = new DescribeTheMonth();
		
		//	create an object of MonthDefinition enum, then
		//	iterate through each member using the values() method...
		for (MonthDefinition md : MonthDefinition.values())
		{
			//	display the month name and the description...
			System.out.print(String.format("%-60s",dtm.MonthDescription(md)));
			//	display the ordinal first...
			System.out.println(md.ordinal());
		}
	}
}


