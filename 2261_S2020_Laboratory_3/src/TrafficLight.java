//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Laboratory Exercise #3
//	File Name:		TrafficLight.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//
//	Program Description:
//	
//	Java program that will simulate the
//	operation and flow of a common traffic
//	control signal.

import java.util.Timer;
import java.util.TimerTask;

import org.uofm.tools.ProgramHelper;
import org.uofm.tools.TrafficSignalControl;

public class TrafficLight
{
	public static void main(String args[])
	{
		ProgramHelper ph = new ProgramHelper();
		TrafficSignalControl tsc = new TrafficSignalControl();
		
		ph.ProgramDescription();
		System.out.println();
		
		long timeDelay = 3000;

		Timer timer = new Timer();
		
		timer.schedule(new TimerTask()
		{
			int status = 0;
			int timerCnt = 0;
			
            @Override
            public void run()
            {
            	tsc.ControlTrafficLight(status);
            	timerCnt++;
            	
            	if(status == 2)
            		status = 0;
            	else
            		status++;
            	
            	if(timerCnt == 4)
            	{
            		timer.cancel();
                    timer.purge();
                    
                    System.out.println();
            		ph.DeveloperInformation();
            		
                    return;
            	}
            }
        }, 0, timeDelay);
	}
}
