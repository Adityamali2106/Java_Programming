class Logic
{
	void PrintEvenNumber(int iBase, int iExp)
	{
		int iCnt = 0;
		int iAns = 0;

		for (iCnt = 1, iAns = 1; iCnt <= iExp; iCnt++)
		{
			iAns = iAns * iBase;		
		}

		System.out.println("Result is: "+iAns);

	}
}

// O(N)

class Program19_5
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.PrintEvenNumber(2,5);
	}
}
