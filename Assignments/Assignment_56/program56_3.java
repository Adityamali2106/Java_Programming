//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program56_3
//    Description  : Accept file name from user and open that File 
//                   in write mode and write into that file.
//    Author Name  : Aditya Vijay Mali
//    Date         : 26/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program56_3
{
    public static void main(String A[] )
	{
		String FileName;
        String Data;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the file Name: ");
		FileName = sobj.nextLine();	

        System.out.println("Enter Data to write into file : ");
        Data = sobj.nextLine(); 

		File obj = new File(FileName);

		if (obj.exists()) {
            System.out.println("File opened successfully.");
        } else {
            System.out.println("File does not exist.");
        }


        try 
        {
            FileWriter fw = new FileWriter(FileName,true);
            fw.write(Data);
            fw.close();

            System.out.println("Data written successfully");
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        sobj.close();
	}
}