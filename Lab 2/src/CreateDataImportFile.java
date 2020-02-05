//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Lab 2
//	File Name:		CreateDataImportFile.java
//	Developer:		Cameron Hall
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//
//  This program will create a delimiter file that can be later used to import into excel.
//	This will also allow the user to determine the place in which to create and edit the file.


import java.io.IOException;
import java.util.Scanner;

import org.uofm.tools.DataFile;
import org.uofm.tools.ProgramHelper;



public class CreateDataImportFile {

	public static void main(String[] args) throws IOException
	{
		boolean successflag;
		DataFile dF = new DataFile();
		ProgramHelper.ProgramDescription();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the input filepath: ");
		String inputFile = keyboard.nextLine();
		System.out.print("What is the output filepath: ");
		String outputFile = keyboard.nextLine();
		System.out.print("Please input the delimiter of the current file: ");
		String delimiter = keyboard.nextLine();
		System.out.print("Input the delimiter to repalce this: ");
		String replacement = keyboard.nextLine();

		successflag = dF.CreateDelimiterFile(inputFile, outputFile, delimiter, replacement);
		  if (successflag = true)
		  {
			  System.out.println();
			  System.out.println("The file was formatted and written successfully!");
			  System.out.println();
		  }
		  else
		  {
			  System.out.println();
			  System.out.println("Something went wrong during copy!");
			  System.out.println();
		  }

		keyboard.close();
		ProgramHelper.DeveloperInformation();
	}

}
