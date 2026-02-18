import java.util.Scanner;

class Logic
{
    boolean chkBit(int iNo)
    {
        int iMask = 0x00004000;
        long iResult = 0;

        iResult = iMask & iNo;

        if (iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program64_1
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
            System.out.println("15th bit is ON");
        }
        else
        {
            System.out.println("15th bit is OFF");
        }

    }
}