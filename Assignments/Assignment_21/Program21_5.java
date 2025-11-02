class Logic
{
	void PrintDivisibleBy2And3(int iNo)
	{
		int iCnt = 0;

	    for(iCnt = 1; iCnt <= iNo;iCnt++)
	    {
	        if ((iCnt % 2) == 0 && (iCnt % 3) ==0)
	        {
			    System.out.println("Divisible by both 2 and 3 is: "+iCnt);
	        }
	    }

	}
}

// O(N)

class Program21_5
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.PrintDivisibleBy2And3(30);
	}
}