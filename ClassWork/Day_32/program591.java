import java.io.*;
import java.util.*;

class program591
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        int i = 0, j = 0;
        byte Buffer[] = new byte[1024];
        byte Key = 0x11;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Folder :");
        String FolderName = sobj.nextLine();

        System.out.println("Enter the name of Packed File :");
        String PackName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File packObj = new File(PackName);

            packObj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(packObj);
            
            FileInputStream fiobj = null;

            System.out.println("Folder is persent ");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of Files in the folder are : "+fArr.length);

            for(i = 0; i < fArr.length;i++)
            {
                fiobj = new FileInputStream(fArr[i]);
                System.out.println("File Name : "+fArr[i].getName()+" File Size : "+fArr[i].length()+" bytes");

                if(fArr[i].getName().endsWith(".txt") == true)
                {
                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        //Encryption Logic
                        for (j = 0; j < iRet; j++)
                        {
                            Buffer[j] = (byte)(Buffer[j] ^ Key);
                        }

                        foobj.write(Buffer,0,iRet);
                    }
                }

                fiobj.close();
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such Folder ");
        }
    }
}