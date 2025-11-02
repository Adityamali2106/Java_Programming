class Logic
{
	void CountDigits(int iNo)
	{
		int iCount = 0;
    
	    while (iNo != 0)
	    {
	        iNo = iNo / 10;
	        iCount++;
	    }

		System.out.println(iCount);		
	}
}

// O(N)

class Program16_5
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.CountDigits(7865);
	}
}
