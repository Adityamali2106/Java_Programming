class Logic
{
	void CkeckPerfect(int iNo)
	{
		int iCnt = 0;
		int iAdd = 0;

		for (iCnt = 1; iCnt <= (iNo/2); iCnt++)
		{
			if ((iNo %iCnt) == 0)
			{
				iAdd = iAdd + iCnt;	
			}		
		}

		if (iAdd == iNo)
		{
			System.out.println(iNo+" is A Perfect Number");		
		}
		else
		{
			System.out.println(iNo+" is Not Perfect Number");		
		}
	}
}

//	O(N)

class Program20_3
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.CkeckPerfect(28);
	}
}
