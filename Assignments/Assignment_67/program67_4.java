import java.util.Scanner;

class Logic
{
    boolean chkBit(int iNo,int iPos1,int iPos2)
    {
        int iMask1 = 0x00000001;
        int iMask2 = 0x00000001;

        iMask1 = 1 << (iPos1 -1);
        iMask2 = 1 << (iPos2 -1);

        int iMask = iMask1 | iMask2;

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

class program67_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        int iValue = 0;
        int iPos1 = 0,iPos2 = 0;
        boolean bRet = false;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        System.out.println("Enter First Position of bit  :");
        iPos1 = sobj.nextInt();

        System.out.println("Enter Secound Position of bit :");
        iPos2 = sobj.nextInt();

        bRet = lobj.chkBit(iValue,iPos1,iPos2);

        if(bRet == true)
        {
            System.out.println(iPos1+"th or "+iPos2+"th bit is ON");
        }
        else
        {
            System.out.println(iPos1+"th or "+iPos2+"th bit is OFF");
        }

    }
}