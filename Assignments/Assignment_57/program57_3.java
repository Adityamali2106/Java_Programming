//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program57_3
//    Description  : Accept directory name from user and create that directory.
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

		if (dir.mkdir())
		{
			System.out.println("Directory created Successfully");
		}
		else
		{
			System.out.println("Directory is Already present");
		}

		sobj.close();
	}
}