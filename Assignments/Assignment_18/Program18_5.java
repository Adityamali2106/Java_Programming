class Logic
{
	void CheckSign(int iNo)
	{
		if(iNo < 0)
	    {
	        System.out.println("Number is Negative");
	    }
	    else if(iNo == 0)
	    {
	   	    System.out.println("Number is Zero"); 	
	    }
	    else
	    {
	        System.out.println("Number is Positive");
	    }
	}
}

class Program18_5
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.CheckSign(-8);
	}
}