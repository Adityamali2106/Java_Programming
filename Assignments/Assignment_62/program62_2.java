//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program60_5
//    Description  : Accept File name and integer N from user and copy first N bytes into a new File 
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
import java.net.SocketPermission;

class program62_2
{
    public static void main(String A[])
    {
        int i = 0,ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String FileName = sc.nextLine();

        System.out.print("Enter how many bytes you want to copy ");
        int N = sc.nextInt();

        try
        {
            File fobj = new File(FileName);
            if(fobj.exists())
            {
                FileInputStream fiobj = new FileInputStream(fobj);
                FileOutputStream foobj = new FileOutputStream("FirstNBytes.txt");

                while((ch = fiobj.read()) != -1 && i < N)
                {
                    foobj.write(ch);
                    i++;
                }

                System.out.println("N bytes are Copyed into 'FirstNBytes.txt' ");
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