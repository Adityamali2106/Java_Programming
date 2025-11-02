class Logic
{
	void CalculateSum(int iNo)
	{
		int iCnt = 0;
		int iSum = 0;

		for (iCnt = 1;iCnt <= iNo; iCnt++)
		{
			iSum = iSum + iCnt; 
		}

		System.out.println(iSum);
	}
}

// O(N)

class Program16_1
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.CalculateSum(10);
	}
}
