class Logic
{
	void SumEvenOddDigits(int iNo)
	{
		int iDigit = 0;
	    int iAddDigits1 = 0;
	    int iAddDigits2 = 0;

	    while(iNo != 0)
	    {
	        iDigit = iNo % 10;
	        if ((iDigit % 2) == 0)
	        {
	            iAddDigits1 = iAddDigits1 + iDigit;
	        }

	        if ((iDigit % 2) != 0)
	        {
	            iAddDigits2 = iAddDigits2 + iDigit;
	        }

	        iNo = iNo / 10;
	    }

	    System.out.println("Sum of Even Digits: "+iAddDigits1);
	    System.out.println("Sum of Odd Digits: "+iAddDigits2);
	}
}

// O(N)

class Program18_4
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.SumEvenOddDigits(123456);
	}
}