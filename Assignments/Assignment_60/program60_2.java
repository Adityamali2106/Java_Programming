//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program60_2
//    Description  : To display Largest File From given Directory.
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program60_2
{
    public static void main(String A[])
    {
        long iSize = 0;
        String fileName = null;
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
                    if(fArr[i].isFile())
                    {
                        if(iSize < fArr[i].length())
                        {
                            iSize = fArr[i].length();
                            fileName = fArr[i].getName();
                        }
                    }
                }
                System.out.println("Largest File in a directory is : "+fileName);
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