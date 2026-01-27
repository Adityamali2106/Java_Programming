//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program58_2
//    Description  : Write data of a file into another file .
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
        String line;

		System.out.println("Enter the directory Name : ");
		dirName = sobj.nextLine();

		File dir = new File(dirName);
        File Marvellous = new File("Marvellous.tct");

        try
        {
            File obj2 = new File("Marvellous.txt");
            obj2.createNewFile();

            FileWriter fw = new FileWriter("Marvellous.txt",true);

            if (dir.exists() && dir.isDirectory())
            {
                File[] files = dir.listFiles();

                for (File file : files) 
                {
                    if (file.isFile())
                    {
                        line = file.getName();
                        fw.write(line+"\n");		
                    }	
                }
            }
            else
            {
                System.out.println("Directory is not present");
            }

            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

		sobj.close();
	}
}