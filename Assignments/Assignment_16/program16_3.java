class Logic
{
	void FindFactorial(int iNo)
	{
		int iCnt = 0;
		int iFactorial = 0;

		for (iCnt = 1, iFactorial = 1; iCnt <= iNo;iCnt++)
		{
			iFactorial = iFactorial * iCnt;
		}

		System.out.println(iFactorial);		
	}
}

// O(N)

class Program16_3
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.FindFactorial(5);
	}
}
