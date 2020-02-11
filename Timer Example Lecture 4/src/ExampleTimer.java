//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Lecture 4-1.3
//	File Name:		DelimitersExample.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Program that demonstrates the use of a timer
//	within a program.

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ExampleTimer
{
	public static void main(String[] args)
	{
		//	create an object of the Timer class...
		Timer timer = new Timer();
		//	create a delay value for the timer representing milliseconds...
		long timeDelay = 1000;  //	(1000 ms = 1 sec.)
		
		//	call method to schedule the timer...
		timer.schedule(new TimerTask()
		{
			//	count value to use in displaying and stopping timer...
			int countValue = 0;
			
			@Override
            public void run()
            {
				//	call method to display current count...
				DisplayCount(countValue);
				//	increment the counter...
				countValue++;
				
				//	here is where we will determine whether or not the
				//	timer will be stopped...
				if(countValue == 10)
				{
					//	cancel and purge the timer and let the user know
					//	that the timer has stopped...
					timer.cancel();
                    timer.purge();
                    System.out.println("The timer has now stopped!");
                    return;
				}
            }
		}, 0, timeDelay);
	}
	
	/*
	 * 	Method used to display data on each iteration
	 *  of the timer call.
	 */
	public static void DisplayCount(int cnt)
	{
		/*
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
	    String strDate = sdfDate.format(now);
	    System.out.println("[" + strDate + "] ");
	    */
		//	print out the count received...
		System.out.println("The count is now :  " + cnt);
	}
}
