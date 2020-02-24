//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Lecture 4-1.2
//	File Name:		DelimitersExample.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Program that demonstrates the use of enumerations
//	that contain custom string values within a program.

import org.uofm.tools.DayDefinition;

public class DayExample
{
	public static void main(String[] args)
	{
		//	loop through the enum...
		for (DayDefinition dd : DayDefinition.values())
		{
			//	based on the enum selected within the loop, execute
			//	the appropriate case statement...
			switch(dd)
			{
				case SUNDAY:
					//	print out the value of the enumeration...
					System.out.print(DayDefinition.valueOf("SUNDAY"));
					//	print out the schedule associated with that enumeration...
					System.out.println(dd.getSchedule());
					break;
				case MONDAY:
					//	print out the value of the enumeration...
					System.out.print(DayDefinition.valueOf("MONDAY"));
					//	print out the schedule associated with that enumeration...
					System.out.println(dd.getSchedule());
					break;
				case TUESDAY:
					//	print out the value of the enumeration...
					System.out.print(DayDefinition.valueOf("TUESDAY"));
					System.out.println(dd.getSchedule());
					break;
				case WEDNESDAY:
					//	print out the value of the enumeration...
					System.out.print(DayDefinition.valueOf("WEDNESDAY"));
					System.out.println(dd.getSchedule());
					break;
				case THURSDAY:
					//	print out the value of the enumeration...
					System.out.print(DayDefinition.valueOf("THURSDAY"));
					//	print out the schedule associated with that enumeration...
					System.out.println(dd.getSchedule());
					break;
				case FRIDAY:
					//	print out the value of the enumeration...
					System.out.print(DayDefinition.valueOf("FRIDAY"));
					//	print out the schedule associated with that enumeration...
					System.out.println(dd.getSchedule());
					break;
				case SATURDAY:
					//	print out the value of the enumeration...
					System.out.print(DayDefinition.valueOf("SATURDAY"));
					//	print out the schedule associated with that enumeration...
					System.out.println(dd.getSchedule());
					break;
				default:
					break;
			}
		}
	}
}




