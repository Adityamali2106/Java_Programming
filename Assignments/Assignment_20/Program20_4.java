class Logic
{
    void FindLArgestDigit(int iNo)
    {
        int iDigit = 0;
        int iTemp = 0;

        if (iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit > iTemp)
            {
                iTemp = iDigit;
            }

            iNo = iNo / 10;
        }
        
        System.out.println(iTemp+" is A Largest Digit in Number");
    }
}

// O(N)

class Program20_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindLArgestDigit(824259);
    }
}
