class Logic
{
	void FindMax(int iNo1, int iNo2)
	{
		if(iNo1 > iNo2)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("a is Less than b");
		}
	}
}

class Program17_3
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.FindMax(20,15);
	}
}