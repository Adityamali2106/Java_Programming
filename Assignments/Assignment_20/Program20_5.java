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

        iTemp = 9;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit < iTemp)
            {
                iTemp = iDigit;
            }

            iNo = iNo / 10;
        }
        
        System.out.println(iTemp+" is A Smallest Digit in Number");
    }
}

// O(N)

class Program20_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindLArgestDigit(458720);
    }
}
