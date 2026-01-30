//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program60_1
//    Description  : To display calculate size of all files from given directory.
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program60_1
{
    public static void main(String A[])
    {
        long iSize = 0;
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
                        iSize = iSize + fArr[i].length();
                    }
                }
                System.out.println("Total size of all Files in a directory is : "+iSize+" Bytes");
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