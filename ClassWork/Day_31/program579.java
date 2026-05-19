import java.io.*;
import java.util.*;

class program579
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = new File("PPA.txt");

        if(fobj.exists())
        {
            System.out.println("Folder is persent ");
        }
        else
        {
            System.out.println("There is no such Folder ");
        }
    }
}