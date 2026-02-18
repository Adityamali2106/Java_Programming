import java.util.Scanner;

class Logic
{
    void CommonBits(int iNo1,int iNo2)
    {
        int iCount = 0;

        while(iNo1 != 0 || iNo2 != 0)
        {
            iCount++;
            if(((iNo1 & 1) == 1) && ((iNo2 & 1) == 1))
            {
                System.out.print(iCount+"\t");
            }
            iNo1 = iNo1 >> 1;
            iNo2 = iNo2 >> 1;
        }
        System.out.println();
    }
}

class program67_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter First Number:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Secound Number:");
        iValue2 = sobj.nextInt();

        lobj.CommonBits(iValue1,iValue2);

    }
}