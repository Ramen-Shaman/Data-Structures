//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Lecture 3-1.1
//	File Name:		DelimitersExample.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Program that demonstrates using delimiters
//	to parse String data and place it within
//	an array.

public class DelimitersExample
{
	public static void  main(String args[])
	{
		System.out.println("Example of string split using pipe (|) character:");
		
		//	create a String delimited by the pipe character...
		String strData = "Hello|and|welcome|to|TECH 2261|Data Structures|Spring|2020";
		
		//	create an array where the data will be stored once parsed...
		String[] dataArray = null;
		
		//	pipe (|) is a special character in regex. to escape it, we must prefix it with backslash (\)...
		dataArray = strData.split("\\|");
		
		for(int a=0; a<dataArray.length; a++)
		{
			System.out.print(dataArray[a] + " ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Example of string split using comma (,) character:");
		
		strData = "Hello,and,welcome,to,TECH 2261,Data Structures,Spring,2020";
		
		//	comma (,) does not need to be escaped...
		dataArray = strData.split(",");
		
		for(int a=0; a<dataArray.length; a++)
		{
			System.out.print(dataArray[a] + " ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Example of string split using asterisk (*) character:");
		
		strData = "Hello*and*welcome*to*TECH 2261*Data Structures*Spring*2020";
		
		//	asterisk (*) is a special character in regex. to escape it, we must prefix it with backslash (\)...
		dataArray = strData.split("\\*");
		
		for(int a=0; a<dataArray.length; a++)
		{
			System.out.print(dataArray[a] + " ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Example of string split using dash (-) character:");
		
		strData = "Hello-and-welcome-to-TECH 2261-Data Stru-cturesSpring-2020";
		
		//	dash (-) does not need to be escaped...
		dataArray = strData.split("-");
		
		for(int a=0; a<dataArray.length; a++)
		{
			System.out.print(dataArray[a] + " ");
		}
	}
}
