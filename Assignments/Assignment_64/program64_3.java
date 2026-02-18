import java.util.Scanner;

class Logic
{
    boolean chkBit(int iNo)
    {
        int iMask = 0x08104040;
        int iResult = 0;

	    iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program64_3
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
            System.out.println("7th & 15th & 21st & 28th bit are ON");
        }
        else
        {
            System.out.println("7th & 15th & 21st & 28th bit are OFF");
        }

    }
}