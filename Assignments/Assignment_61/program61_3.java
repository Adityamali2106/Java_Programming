//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program60_5
//    Description  : Accept the name of file and string and Append that string at the end of a file 
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program61_3
{
    public static void main(String A[])
    {
        File fobjsrc = null;

        String FileName = null;
        String str = null;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the File Name : ");
        FileName = sobj.nextLine();

        System.out.println("Enter String to Add into File : ");
        str = sobj.nextLine();

        fobjsrc = new File(FileName);
        try
        {
            if(fobjsrc.exists())
            {
                FileWriter fw = new FileWriter(FileName, true); 
                fw.write(str);
                fw.close();
                System.out.println("String appended successfully.");
            }
            else
            {
                System.out.println("File is not present");
            }
        }
        catch(Exception E)
        {
            System.out.println(E.getMessage());
        }
        sobj.close();
    }
}