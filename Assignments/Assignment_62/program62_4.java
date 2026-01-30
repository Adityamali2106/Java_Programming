//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program62_4
//    Description  : Accept File name from user and backup of it with name original_backup.ext 
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program62_4
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner sc = new Scanner(System.in);
        byte Buffer[] = new byte[1024];

        System.out.println("Enter file name: ");
        String FileName = sc.nextLine();

        int dot = FileName.lastIndexOf(".");
        String backupName = FileName.substring(0,dot) + "_backup" + FileName.substring(dot);

        try
        {
            File fobj = new File(FileName);

            if(fobj.exists())
            {
                FileInputStream fiobj = new FileInputStream(fobj);
                FileOutputStream foobj = new FileOutputStream(backupName);
    
                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                }

                System.out.println("Created A backup file with name : "+backupName);
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