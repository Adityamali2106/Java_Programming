class Logic
{
	void PrintTable(int iNo)
	{
		int iCnt = 0;

		for(iCnt = 1; iCnt <= 10;iCnt++)
		{
			System.out.print((iNo * iCnt)+"\t");
		}
	}
}

// O(N)

class Program17_5
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.PrintTable(5);
	}
}