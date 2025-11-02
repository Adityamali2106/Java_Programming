class Logic
{
	void CheckDivisible(int iNo)
	{
		if(((iNo % 5) ==0) && ((iNo % 11) ==0))
	    {
	        System.out.println("Number is Divisible by 5 And 11");
	    }
	    else
	    {
	        System.out.println("Number is  Not Divisible by 5 And 11");
	    }
	}
}

class Program19_3
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.CheckDivisible(55);
	}
}
