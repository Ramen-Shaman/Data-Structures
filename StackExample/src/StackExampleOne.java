//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Lecture 7-2.1
//	File Name:		StackExampleOne.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Program that demonstrates the concept
//	of a Stack algorithm.

import org.uofm.tools.MyStack;

/**
 * Class that demonstrates the concept
 * of a Stack algorithm.
 * 
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />Herff College of Engineering
 * <br />The University of Memphis
 * @since 1.0
 */
public class StackExampleOne
{
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	create an object of the MyStack class and initialize to 5 elements...
		MyStack s = new MyStack(5);
		//	number initializer...
		int x = 10;
		
		//	keep pushing the numbers onto the stack
		//	until the stack is full...
		while(!s.isFull())
		{
			s.push(x*2);	//	push the new value...
			x+=5;			//	increment the number...
			s.PrintStack();	//	print out the stack...
		}
		
		//	let the user know if the stack is full...
		if(s.isFull())
		{
			System.out.println("The stack is full!");
		}
		
		//	add some line spacing...
		System.out.println();
		
		//	keep poping the numbers off the stack
		//	until the stack is empty...
		while(!s.isEmpty() )
		{
			//	pop the value from the stack...
			double value = s.pop();
			//	show the user what value was popped...
			System.out.println("pop() ->  " + value);
		}

		//	let the user know if the stack is empty...
		if(s.isEmpty())
		{
			//	add some line spacing...
			System.out.println();
			System.out.println("The stack is empty!");
		}
	}
}