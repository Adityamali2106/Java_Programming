//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program58_1
//    Description  : To display all names of files from a directory.
//    Author Name  : Aditya Vijay Mali
//    Date         : 26/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program57_3
{
	public static void main(String A[])
	{
		String dirName;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the directory Name : ");
		dirName = sobj.nextLine();

		File dir = new File(dirName);

		if (dir.exists() && dir.isDirectory())
		{
			File[] files = dir.listFiles();

			System.out.println("\nReguler Files Are : ");

			for (File file : files) 
			{
				if (file.isFile())
				{
					System.out.println("\t\t\t"+file.getName());		
				}	
			}
		}
		else
		{
			System.out.println("Directory is not present");
		}

		sobj.close();
	}
}