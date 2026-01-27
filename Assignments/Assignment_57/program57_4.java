//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program57_4
//    Description  : Accept file name from user and calculate checksum of that file.
//    Author Name  : Aditya Vijay Mali
//    Date         : 26/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program57_4
{
	public static void main(String A[])
	{
		int iSum = 0,data = 0;
		String FileName;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter File Name : ");
		FileName = sobj.nextLine();

		File dir = new File(FileName);

		try 
		{
			FileInputStream ptr = new FileInputStream(FileName);

			while((data = ptr.read())!= -1)
			{
				iSum = iSum + data;
			}

			ptr.close();
			System.out.println("Checksum of a file is : "+ iSum);
		}
		catch(Exception e)
		{
			System.out.println("Error : "+ e.getMessage());
		}

		sobj.close();
	}
}