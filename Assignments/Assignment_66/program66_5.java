import java.util.Scanner;

class Logic
{
    long ToggleBit(long iNo)
    {
        long iMask = 0xf000000f;
        long iResult = 0;

        iResult = iMask ^ iNo;
        
        return iResult;
    }
}

class program66_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        long iValue = 0;
        long iRet = 0;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        iRet = lobj.ToggleBit(iValue);

        System.out.println("Updated value is : "+iRet);           

    }
}