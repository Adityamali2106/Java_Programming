class Logic
{
	void CheckPalindrome(int iNo)
	{
		int iReverseNum = 0;
		int iTemp = 0;

		iTemp = iNo;

		while(iTemp != 0)
		{
			iReverseNum = (iReverseNum * 10) + (iTemp % 10);
			iTemp = iTemp / 10;
		}

		System.out.println(iReverseNum == iNo);		
	}
}

// O(N)

class Program17_2
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.CheckPalindrome(121);
	}
}
