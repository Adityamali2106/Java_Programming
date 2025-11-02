class Logic
{
	void PrintEvenNumber(int iNo)
	{
		int iCnt = 0;
		for (iCnt = 1; iCnt <= iNo; iCnt++)
		{
			if((iCnt % 2) != 0)
			{
				System.out.println(iCnt);
			}			
		}
	}
}

// O(N)

class Program18_3
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.PrintEvenNumber(20);
	}
}