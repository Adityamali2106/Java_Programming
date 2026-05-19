import java.io.*;
import java.util.*;

class program581
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Folder :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Folder is persent ");
        }
        else
        {
            System.out.println("There is no such Folder ");
        }
    }
}