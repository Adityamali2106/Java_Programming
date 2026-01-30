//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program60_5
//    Description  : Accept two File names from user and copy it into thired File 
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program61_4
{
    public static void main(String A[])
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first file name: ");
        String FileName1 = sobj.nextLine();

        System.out.println("Enter second file name: ");
        String FileName2 = sobj.nextLine();

        System.out.println("Enter output file name: ");
        String outputFile = sobj.nextLine();

        File fobjsrc1 = new File(FileName1);
        File fobjsrc2 = new File(FileName2);
        
        try
        {
            if(fobjsrc1.exists() && fobjsrc2.exists())
            {
                File fobjdest = new File(outputFile);
                fobjdest.createNewFile();

                FileInputStream fiobj1 = new FileInputStream(fobjsrc1);
                FileInputStream fiobj2 = new FileInputStream(fobjsrc2);
                FileOutputStream foobj = new FileOutputStream(fobjdest);

                while((iRet = fiobj1.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                }
            
                while((iRet = fiobj2.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                }

                System.out.println("File Copy Succesfull");
                fiobj1.close();
                fiobj2.close();
                foobj.close();
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