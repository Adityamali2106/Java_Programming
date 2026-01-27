//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program57_2
//    Description  : Accept file name from user and check whether it is regular file or not.
//    Author Name  : Aditya Vijay Mali
//    Date         : 26/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program57_2
{
	public static void main(String A[])
	{
		String FileName;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter File Name : ");
		FileName = sobj.nextLine();

		File file = new File(FileName);

		if (file.exists() && file.isFile())
		{
			System.out.println("It is a regular File");
		}
		else
		{
			System.out.println("It is Not a regular File");
		}

		sobj.close();
	}
}