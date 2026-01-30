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
import java.net.SocketPermission;

class program61_5
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fileName = sc.nextLine();

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String[] lines = br.lines().toArray(String[]::new);
            br.close();

            int mid = lines.length / 2;

            FileWriter fw1 = new FileWriter("first_half.txt");
            FileWriter fw2 = new FileWriter("second_half.txt");

            for (int i = 0; i < mid; i++) 
            {
                fw1.write(lines[i] + "\n");
            }

            for (int i = mid; i < lines.length; i++) 
            {
                fw2.write(lines[i] + "\n");
            }

            fw1.close();
            fw2.close();

            System.out.println("File split successfully.");
        }
        catch(Exception E)
        {
            System.out.println(E.getMessage());
        }
        sc.close();
    }
}