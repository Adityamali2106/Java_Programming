import java.util.Scanner;

class Logic
{
    long chkBit(long iNo)
    {
        long iMask = 0x00000240;
        long iResult = 0;

        iResult = iMask ^ iNo;

        return iResult;
    }
}

class program65_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        long iValue = 0;
        long iRet = 0;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        iRet = lobj.chkBit(iValue);

        System.out.print("After the 7th and 10th bit off :");
        System.out.println("\t Updated value is : "+iRet);           

    }
}