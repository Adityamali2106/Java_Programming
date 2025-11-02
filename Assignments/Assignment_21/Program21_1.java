class Logic
{
    void ProductOfDigits(int iNo)
    {
        int iDigit = 0;
        int iProduct = 0;

        if (iNo < 0)
        {
            iNo = -iNo;
        }

        iProduct = 1;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit != 0)
            {
            	iProduct = iProduct * iDigit;
            }
            iNo = iNo / 10;
        }
        
        System.out.println("Producgt of Digit is: "+ iProduct);
    }
}

// O(N)

class Program21_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.ProductOfDigits(2340);
    }
}
