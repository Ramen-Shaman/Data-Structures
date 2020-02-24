package org.uofm.tools;

public enum DayDefinition
{
	//	the enum containing the enum definitions
	SUNDAY("     OFF"),
	MONDAY("     TECH 2261 5:30 PM - 6:55 PM, TECH 4263 7:10 PM - 9:55 PM"),
	TUESDAY("    OFF"),
	WEDNESDAY("  TECH 2261 5:30 PM - 6:55 PM, TECH 4263 7:10 PM - 9:55 PM"),
	THURSDAY("   OFF"),
	FRIDAY("     OFF"),
	SATURDAY("   OFF"); 
	
	//	accessor variable used only within this enum class...
	private String schedule;
	
	//	member method used to get the schedule from the enum...
	public String getSchedule()
	{
        return this.schedule;
    }
	
	//  enum constructor... 
	private DayDefinition(String schedule)
    {
        this.schedule = schedule;
    }
}