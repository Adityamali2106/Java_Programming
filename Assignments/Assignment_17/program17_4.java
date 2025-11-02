class Logic
{
	void FindMax(int iNo1, int iNo2,int iNo3)
	{
		int iTemp = 0;

		if (iNo1 >= iNo2)
		{
			if(iNo1 >= iNo3)
			{
				System.out.println(iNo1+" is greater");
			}
			else
			{
				System.out.println(iNo3+" is greater");
			}
		}
		else
		{
			if (iNo2 >= iNo3)
			{
				System.out.println(iNo2+" is greater");
			}
			else
			{
				System.out.println(iNo3+" is greater");
			}
		}
	}
}

class Program17_4
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.FindMax(3,7,2);
	}
}