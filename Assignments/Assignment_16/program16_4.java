class Logic
{
	void ReverseNumber(int iNo)
	{
		int iReverseNum = 0;

		while(iNo != 0)
		{
			iReverseNum = iReverseNum * 10 + iNo % 10;
			iNo = iNo / 10;
		}

		System.out.println(iReverseNum);		
	}
}

// O(N)

class Program16_4
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.ReverseNumber(1234);
	}
}