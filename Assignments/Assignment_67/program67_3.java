import java.util.Scanner;

class Logic
{
    boolean chkBit(int iNo)
    {
        int iMask = 0x00000800 | 0x00000100;

        if ((iNo & iMask) != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program67_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        bRet = lobj.chkBit(iValue);

        if(bRet == true)
        {
            System.out.println("9th or 12th bit is ON");
        }
        else
        {
            System.out.println("9th or 12th bit is OFF");
        }

    }
}