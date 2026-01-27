//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program57_1
//    Description  : Accept two file name from user open first File and copy it into second file.
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
		String FileName1,FileName2;
        String line;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the file Name from where to copy the containts:");
		FileName1 = sobj.nextLine();	

        System.out.println("Enter the file Name where to copy the containts :");
        FileName2 = sobj.nextLine();    

        File obj = new File(FileName1);

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
            File obj2 = new File(FileName2);
            obj2.createNewFile();
        
            BufferedReader br = new BufferedReader(new FileReader(FileName1));
            FileWriter fw = new FileWriter(FileName2,true);

            while ((line = br.readLine()) != null) 
            {
                fw.write(line);
            }

            fw.close();
            br.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        sobj.close();
	}
}