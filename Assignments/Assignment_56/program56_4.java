//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program56_4
//    Description  : Accept file name from user create new file if it is not existing.
//    Author Name  : Aditya Vijay Mali
//    Date         : 26/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

public class program56_4
{
	public static void main(String A[])
	{
		String FileName;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the File Name :");
		FileName = sobj.nextLine();

		try
		{
			File obj = new File(FileName);

			if (obj.createNewFile()) 
			{
				System.out.println("File Created Succesfully ");	
			}
			else 
			{
				System.out.println("File already Exists ");	
			}
		}
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

		sobj.close();
	}
}