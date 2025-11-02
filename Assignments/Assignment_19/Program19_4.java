class Logic
{
    void PrintDigits(int iNo)
    {
        int iDigit = 0;

        if (iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit+ "\t");

            iNo = iNo / 10;
        }
    }
}

// O(N)

class Program19_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintDigits(9876);
    }
}
