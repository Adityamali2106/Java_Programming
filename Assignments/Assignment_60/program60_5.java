//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program60_5
//    Description  : get a path from user and check whether it exists or not, 
//                   if it is present then check wether it is directory of file 
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
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Directory name : ");
        String Path = sobj.nextLine();

        File fobj = new File(Path);

        if (fobj.exists()) 
        {
            if (fobj.isFile())
            {
                System.out.println("Path exists and it is a file.");
            } 
            else if (fobj.isDirectory())
            {
                System.out.println("Path exists and it is a directory.");
            }
        } 
        else
        {
            System.out.println("Path does not exist.");
        }
        sobj.close();
    }
}