//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program57_5
//    Description  : Accept directory name from user and diaplay all names of files 
//                   from that directory and size of each file.
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

			System.out.println("\n File NAme \t\t Size \t");

			for (File file : files) 
			{
				if (file.isFile())
				{
					System.out.println(file.getName() + " \t\t " + file.length());		
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