//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program59_1
//    Description  : To display all names of files from a directory.
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program59_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Directory name : ");
        String DirName = sobj.nextLine();

        try
        {
            File fobj = new File(DirName);

            if ((fobj.exists()) && (fobj.isDirectory()))
            {
                File fArr[] = fobj.listFiles();

                for(int i = 0; i < fArr.length;i++)
                {
                    System.out.println("File Name : "+fArr[i].getName());
                }
            }
            else
            {
                System.out.println("There is no such Folder ");
            }
        }
        catch(Exception E)
        {
            System.out.println(E.getMessage());
        }

    }
}