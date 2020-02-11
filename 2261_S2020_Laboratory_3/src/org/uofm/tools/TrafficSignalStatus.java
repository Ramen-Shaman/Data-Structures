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

public enum TrafficSignalStatus
{
	RED("Stop"),
	GREEN("Proceed"),
	YELLOW("Caution");
 
	private String action;
 
	/**
	 * Method that gets actionable item.
	 * @return
	 */
	public String getAction()
	{
        return this.action;
    }
	
	/**
	 * Method that returns the status of the enum.
	 * @param action
	 */
    private TrafficSignalStatus(String action)
    {
        this.action = action;
    }
}
