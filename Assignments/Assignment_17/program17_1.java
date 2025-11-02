class Logic
{
	void SumOfDigits(int iNo)
	{
		int iDigits = 0;
		int iSumDigits = 0;
    
	    while (iNo != 0)
	    {
	    	iDigits = iNo % 10;
	        iSumDigits = iSumDigits + iDigits;
	        iNo = iNo / 10;
	    }

		System.out.println(iSumDigits);		
	}
}

// O(N)

class Program17_1
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.SumOfDigits(1234);
	}
}