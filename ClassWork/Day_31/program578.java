import java.io.*;
import java.util.*;

class program578
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = new File("Marvellous");

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