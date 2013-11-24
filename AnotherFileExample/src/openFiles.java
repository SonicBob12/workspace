import acm.program.*;
import java.io.*;
import java.util.*;

public class openFiles {

	public class AnotherFileExample extends ConsoleProgram {
		
		private BufferedReader openFile(String prompt)	{
			BufferedReader rd = null;
			
			while (rd == null) {
				try {
					String filename = readline(promt);
					rd = new BufferedReader(new FileReader (filename));
				} catch (IOException ex) {
					System.out.println("Nice try punk. That file doesn't exist.");
					
				}
				 
			}
			return rd;
		}
	public void run()	{
		BufferedReader rd = openFile("Please enter Filename: ");
		
		try {
			while(true){
				String line = rd.readLine();
				if (line == null) break;
				println("Read line: [" + line + "]");
			}
			rd.close();
			}catch (IOException ex)	{
				throw new ErrorException(ex);
				
		}
			
		
	}
	
	}
	
	
	
}
