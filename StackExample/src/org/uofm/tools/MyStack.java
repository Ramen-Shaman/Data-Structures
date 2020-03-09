package org.uofm.tools;

/**
 * Class that implements methods
 * of a Stack algorithm.
 * 
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />Herff College of Engineering
 * <br />The University of Memphis
 * @since 1.0
 */
public class MyStack
{
	private int maxSize;
	private double[] stackArray;
	private int top;
	
	//	class constructor...
	public MyStack(int s)
	{
		maxSize = s;
		stackArray = new double[maxSize];
		top = -1;
	}
	
	/**
	 * Method to push
	 * @param j
	 */
	public void push(double j)
	{
		stackArray[++top] = j;
	}
	
	/**
	 * Method to pop
	 * @return
	 */
	public double pop()
	{
		return stackArray[top--];
	}
	
	/**
	 * Method to peek
	 * @return
	 */
	public double peek()
	{
		return stackArray[top];
	}
	
	/**
	 * Method to determine if
	 * stack is empty
	 * @return
	 */
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	/**
	 * Method to determine if
	 * stack is full
	 * @return
	 */
	public boolean isFull()
	{
		return (top == maxSize-1);
	}
	
	/**
	 * Method to print out contents
	 * of stack
	 */
	public void PrintStack()
	{
		System.out.println("----------");
		
		for(int a=stackArray.length-1; a>=0; a--)
		{
			System.out.print("| ");
			System.out.println(String.format("%8s", stackArray[a] + " |"));
			System.out.println("----------");
		}
	}
}
