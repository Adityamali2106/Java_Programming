//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program60_5
//    Description  : get a source file name and Destination file name And copy source into Destination Byte by byte. 
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program60_5
{
    public static void main(String A[])
    {
        int iRet = 0;
        
        String FileNameSrc = null;
        String FileNameDest = null;
        
        File fobjsrc = null;
        File fobjdest = null;

        byte B[] = new byte[1];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Source File : ");
        FileNameSrc = sobj.nextLine();

        fobjsrc = new File(FileNameSrc);

        System.out.println("Enter the name of Destinetion File : ");
        FileNameDest = sobj.nextLine();

        try
        {
            if(fobjsrc.exists())
            {
                fobjdest = new File(FileNameDest);

                fobjdest.createNewFile();

                FileInputStream fiobj = new FileInputStream(fobjsrc);
                FileOutputStream foobj = new FileOutputStream(fobjdest);

                while((iRet = fiobj.read(B)) != -1)
                {
                    // System.out.print(str);
                    foobj.write(B);
                }
                
                System.out.println("File Copy Succesfull");
                fiobj.close();
                foobj.close();
            }
            else
            {
                System.out.println("There is no Source file");
            }
        }
        catch(Exception E)
        {
            System.out.println(E.getMessage());
        }
        sobj.close();
    }
}