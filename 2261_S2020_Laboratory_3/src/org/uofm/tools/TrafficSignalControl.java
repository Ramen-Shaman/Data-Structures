package org.uofm.tools;

//	TECH 2261
//	Data Structures
//	Spring 2020
//	The University of Memphis
//
//	Assignment:		Laboratory Exercise #3
//	File Name:		ProgramHelper.java
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221

public class TrafficSignalControl
{
	/**
	 * Method that handles the traffic light
	 * state and displays the results.
	 * 
	 * @param s
	 */
	public void ControlTrafficLight(int s)
	{
		TrafficSignalStatus signal = null;
		
		switch(s)
		{
			case 0:
				signal = TrafficSignalStatus.valueOf("RED");
	    		s++;
				break;
			case 1:
				signal = TrafficSignalStatus.valueOf("GREEN");
	    		s++;
				break;
			case 2:
				signal = TrafficSignalStatus.valueOf("YELLOW");
	    		s = 0;
				break;
			default:
				s = 0;
				break;
		}
		
		System.out.println("Light Status:  " + String.format("%-25s",signal.name()) + "Action: " + signal.getAction());
	}
}
