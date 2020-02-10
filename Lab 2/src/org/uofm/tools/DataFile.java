package org.uofm.tools;

import java.io.*;

public class DataFile 
{
	public boolean CreateDelimiterFile(String inputName,String outputName, String replaceChar, String delimiter)throws IOException
	{
		boolean successflag = false; 
		PrintWriter out = new PrintWriter(outputName);
		BufferedReader bR = new BufferedReader(new FileReader(inputName));
		BufferedWriter bW = new BufferedWriter(new FileWriter(outputName));
		String data = "";
		String correctedString = null;
	
		
		try 
		{
			while (data != null)
			{
				data.trim();
				data = bR.readLine();
				correctedString = data.replace(replaceChar, delimiter);
				System.out.println(correctedString);
				out.println(correctedString);
			}	
		}
		
		catch (IOException exc)
		{
			out.close();
			bW.close();
			bR.close();
			successflag = false;
		}
		
		catch (NullPointerException Nullexc)
		{
			System.out.println("END OF FILE.");
		}	
		finally
		{
			try
			{
				bR.close();
				bW.close();
				out.close();
				successflag = true;
				
				
			}
			

			catch (Exception exc)
			{
				System.out.println(exc.getMessage());
				successflag = false;
			}
		}
		return successflag;
	}

}
