//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program56_2
//    Description  : Accept file name from user and open that File and Display its contents.
//    Author Name  : Aditya Vijay Mali
//    Date         : 26/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program56_2
{
	public static void main(String A[] )
	{
		String FileName;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the file Name: ");
		FileName = sobj.nextLine();	

		File obj = new File(FileName);

		if (obj.exists()) 
		{
            System.out.println("File opened successfully.");
        } 
        else 
        {
            System.out.println("File does not exist.");
        }


        try 
        {
            BufferedReader br = new BufferedReader(new FileReader(FileName));
            String line;

            System.out.println("\nFile contents:");
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }

            br.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        sobj.close();
	}
}