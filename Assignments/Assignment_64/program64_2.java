import java.util.Scanner;

class Logic
{
    boolean chkBit(long iNo)
    {
        long iMask = 0x00020010;
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

class program64_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        long iValue = 0;
        boolean bRet = false;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        bRet = lobj.chkBit(iValue);

        if(bRet == true)
        {
            System.out.println("5th and 18th bit is ON");
        }
        else
        {
            System.out.println("5th and 18th bit is OFF");
        }

    }
}