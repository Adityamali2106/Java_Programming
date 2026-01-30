//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Program Name : program62_5
//    Description  : Accept File name from user and handle all possible file related exceptoins properly
//    Author Name  : Aditya Vijay Mali
//    Date         : 30/01/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program62_5
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String FileName = sc.nextLine();
        try 
        {
            FileInputStream fiobj = new FileInputStream(FileName);
            System.out.println("File opened successfully.");
            fiobj.close();

        }
        catch (FileNotFoundException E) {
            System.out.println("File not found.");

        }
        catch (IOException E) 
        {
            System.out.println("Input/Output error.");

        }
        catch (Exception E) 
        {
            System.out.println("Some other error occurred.");

        } 
        finally 
        {
            sc.close();
            System.out.println("Program ended.");
        }

        sc.close();
    }
}