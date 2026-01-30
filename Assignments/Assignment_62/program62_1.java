//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program62_1
//    Description  : Accept two File names from user and copy it into thired File 
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program62_1
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        int iRet = 0;
        int iCount= 0;
        byte Buffer[] = new byte[1024];

        System.out.println("Enter file name: ");
        String FileName = sc.nextLine();

        try
        {
            File fobj = new File(FileName);

            if(fobj.exists())
            {
                FileInputStream fiobj = new FileInputStream(fobj);
                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    iCount = iCount + iRet;
                }

                System.out.println("Total Bytes Are : "+iCount);
            }
            else
            {
                System.out.println("File Is Not present.");
            }
        }
        catch(Exception E)
        {
            System.out.println(E.getMessage());
        }
        sc.close();
    }
}