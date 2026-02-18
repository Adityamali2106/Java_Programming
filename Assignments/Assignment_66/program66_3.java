import java.util.Scanner;

class Logic
{
    long OffBit(long iNo,int iPos)
    {
        long iMask = 0x00000001;
        long iResult = 0;

        iMask = iMask << (iPos-1);

        iResult = iMask | iNo;
        
         if (iResult == iMask)
        {   
    	    iResult = iNo ^ iMask;
        }
        
        return iResult;
    }
}

class program66_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        long iValue = 0;
        int iPos = 0;
        long iRet = 0;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        System.out.println("Enter Position : ");
        iPos = sobj.nextInt();


        iRet = lobj.OffBit(iValue,iPos);

        System.out.println("Updated value is : "+iRet);           

    }
}