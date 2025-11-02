class Logic
{
	void CountEvenOddRange(int iNo)
	{
		int iCnt = 0;
	    int iFrequency1 = 0;
	    int iFrequency2 = 0;

	    for(iCnt = 1; iCnt <= iNo;iCnt++)
	    {
	        if ((iCnt % 2) == 0)
	        {
	            iFrequency1++;
	        }

	        if ((iCnt % 2) != 0)
	        {
	            iFrequency2++;
	        }
	    }

	    System.out.println("Total Evem Numbers Are : "+iFrequency1);
	    System.out.println("Total Odd Numbers Are :"+iFrequency2);
	}
}

// O(N)

class Program21_2
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.CountEvenOddRange(50);
	}
}