//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program59_1
//    Description  : To display Count of total directory and total Files in given Directory.
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program59_4
{
    public static void main(String A[])
    {
        int iCountFiles = 0,iCountDir = 0;
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
                        iCountFiles++;
                    }

                    if(fArr[i].isDirectory())
                    {
                        iCountDir++;
                    }
                }
                System.out.println("Total Files are : "+iCountFiles);
                System.out.println("Total Directorys are : "+iCountDir);
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