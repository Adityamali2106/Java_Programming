import java.util.Scanner;

class Logic
{
    long ToggleBitRange(long iNo,int iStart,int iEnd)
    {
        int iWidth = iEnd - iStart + 1;

        long iMask = (0x00000001L << iWidth) - 1;

        iMask = iMask << (iStart - 1);

        return iNo ^ iMask;
    }
}

class program67_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        int iValue = 0;
        int iPos1 = 0,iPos2 = 0;
        long iRet = 0;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        System.out.println("Enter satrt Position  :");
        iPos1 = sobj.nextInt();

        System.out.println("Enter end Position:");
        iPos2 = sobj.nextInt();

        iRet = lobj.ToggleBitRange(iValue,iPos1,iPos2);

       System.out.println("Modified Number is : "+iRet);
    }
}