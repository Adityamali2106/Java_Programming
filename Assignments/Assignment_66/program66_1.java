import java.util.Scanner;

class Logic
{
    ///////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name 	: ChkBit
    //  Discription 	: It is used to Check wether 7th & 15th & 21st & 28th bit is On or OFF.
    //  Input 			: Unsigned Integer
    //  Output 			: Boolen
    //  Author 			: Aditya Vijay Mali
    //  Date 			: 06/02/2026
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////

    boolean chkBit(long iNo,int iPos)
    {
        long iMask = 0x00000001L;
        long iResult = 0;

        iMask = iMask << (iPos -1);

        iResult = iNo & iMask;

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

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entory Point Function for the application
//
///////////////////////////////////////////////////////////////////////////////////////////////

class program64_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        long iValue = 0;
        int iPos = 0;
        boolean bRet = false;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        System.out.println("Enter Position : ");
        iPos = sobj.nextInt();

        bRet = lobj.chkBit(iValue,iPos);

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