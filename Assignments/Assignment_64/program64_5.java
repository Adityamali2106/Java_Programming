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

    boolean chkBit(long iNo)
    {
        long iMask = 0x80000001L;
        long iResult = 0;

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
        boolean bRet = false;

        System.out.println("Enter Number :");
        iValue = sobj.nextLong();

        bRet = lobj.chkBit(iValue);

        if(bRet == true)
        {
            System.out.println("1st & 32th bits are ON");
        }
        else
        {
            System.out.println("1st & 32th bits are OFF");
        }

    }
}