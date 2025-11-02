class Logic
{
	void DisplayGrade(int iNo)
	{
		if(iNo >= 90 && iNo < 100)
	    {
	        System.out.println("A");
	    }
	    else if(iNo >= 80 && iNo < 90)
	    {
	        System.out.println("B");
	    }
	    else if(iNo >= 70 && iNo < 80)
	    {
	        System.out.println("C");
	    }
	    else if(iNo >= 60 && iNo < 70)
	    {
	        System.out.println("D");
	    }
	    else
	    {
	        System.out.println("F");
	    }
	}
}

class Program19_2
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.DisplayGrade(82);
	}
}