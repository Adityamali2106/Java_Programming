import java.io.*;
import java.util.*;

class program577
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        
        String FileNameSrc = null;
        String FileNameDest = null;
        
        File fobjsrc = null;
        File fobjdest = null;

        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Source File : ");
        FileNameSrc = sobj.nextLine();

        fobjsrc = new File(FileNameSrc);

        System.out.println("Enter the name of Destinetion File : ");
        FileNameDest = sobj.nextLine();

        if(fobjsrc.exists())
        {
            fobjdest = new File(FileNameDest);

            fobjdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                // System.out.print(str);
                foobj.write(Buffer,0,iRet);
            }
            
            System.out.println("File Copy Succesfull");
            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no Source file");
        }

        sobj.close();
    }
}