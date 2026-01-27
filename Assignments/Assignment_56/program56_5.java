//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program56_1
//    Description  : Accept Directory name from user and display all Files names from it.
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
		String dirName;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the File Name :");
		dirName = sobj.nextLine();

		File dir = new File(dirName);

		if (dir.exists() && dir.isDirectory()) 
		{
			String[] files = dir.list();

			System.out.println("Files in the Directory :");

			for(String file : files)
			{
				System.out.println(file);
			}
		}
		else 
		{
			System.out.println("Directory does not exists");
		}

		sobj.close();
	}
}