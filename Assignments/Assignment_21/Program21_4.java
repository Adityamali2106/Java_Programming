class Logic
{
	void CountFactors(int iNo)
	{
		int iCnt = 0;
		int iFrequency = 0;

		for (iCnt = 1; iCnt <= (iNo/2); iCnt++)
		{
			if ((iNo %iCnt) == 0)
			{
				iFrequency++;		
			}		
		}
		System.out.println("Total Number of Factors of "+iNo+ "is: "+iFrequency);
	}
}

//	O(N/2)

class Program21_4
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.CountFactors(20);
	}
}
