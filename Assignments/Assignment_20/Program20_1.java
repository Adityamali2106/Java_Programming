class Logic
{
	void SumEvenNumber(int iNo)
	{
		int iCnt = 0;
		int iAns = 0;

		for (iCnt = 1; iCnt <= iNo; iCnt++)
		{
			if((iCnt % 2) == 0)
			{
				iAns = iAns + iCnt;		
			}			
		}
		System.out.println("Result is: "+iAns);
	}
}

//	O(N)

class Program20_1
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.SumEvenNumber(10);
	}
}
