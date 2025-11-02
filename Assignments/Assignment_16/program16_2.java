class Logic
{
	void CheckEvenOdd(int iNo)
	{
		if((iNo % 2) == 0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");		
		}
	}
}

class Program16_2
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.CheckEvenOdd(7);
	}
}
