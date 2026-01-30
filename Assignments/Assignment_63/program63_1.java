//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program63_1
//    Description  : Accept Source and Destination File name from user and copy souce into 
//                   destination using BufferedINputStream and BufferedOutputStream.
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

public class program63_1 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        byte Buffer[] = new byte[1024];
        int iRet = 0;

        System.out.println("Enter source file name : ");
        String SourceFileName = sobj.nextLine();

        System.out.println("Enter Destination file name : ");
        String DestFileName = sobj.nextLine();

        File fSorceBoj = new File(SourceFileName);
        try
        {   
                if (fSorceBoj.exists()) 
            {
                File fDestobj = new File(DestFileName);
                
                fDestobj.createNewFile();

                BufferedInputStream biobj = new BufferedInputStream(new FileInputStream(fSorceBoj));
                BufferedOutputStream boobj = new BufferedOutputStream(new FileOutputStream(fDestobj));
            
                while((iRet = biobj.read(Buffer)) != -1)
                {
                    boobj.write(Buffer,0,iRet);
                }
                boobj.close();
                biobj.close();
            }
        }
        catch(Exception E)
        {
            System.out.println(E.getMessage());
        }
        sobj.close();
    }
}
