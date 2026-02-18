import java.util.Scanner;

class Logic
{
    int CountOne(int iNo)
    {
        int iCount = 0;

        while(iNo != 0)
        {
            if((iNo & 1) == 1)
            {
                iCount++;
            }
            iNo = iNo >> 1;
        }

        return iCount;
    }
}

class program67_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        iRet = lobj.CountOne(iValue);

        System.out.println("Number of ON bits are : "+iRet);           

    }
}