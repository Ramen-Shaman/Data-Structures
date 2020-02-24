package org.uofm.tools;

/**
 * Method used to display information
 * related to the month passed in.
 * @author tcanaday
 *
 */
public class DescribeTheMonth
{
	public String MonthDescription(MonthDefinition month)
	{
		//	store the result in this variable to return later...
		String theResult = "";
		
		//	based on the enum selected, execute
		//	the appropriate case statement...
		switch(month)
		{
			case January:
			case February:
			case November:
			case December:
				theResult = String.format("%-15s", month) + " - cold and miserable time of year.";
				break;
			case June:
				theResult = String.format("%-15s", month) + " - time for vacation in Florida!!!";
				break;
			case July:
			case August:
				theResult = String.format("%-15s", month) + " - Summer month, heat and humidity rule!";
				break;
			case March:
			case April:
			case May:
				theResult = String.format("%-15s", month) + " - getting warmer and closer to summer!";
				break;
			case September:
				theResult = String.format("%-15s", month) + " - getting closer to Halloween!";
				break;
			case October:
				theResult = String.format("%-15s", month) + " - Halloween!!!  The best holiday of all!";
				break;
			default:
				break;
		}
	
		//	return the string...
		return(theResult);
	}
}