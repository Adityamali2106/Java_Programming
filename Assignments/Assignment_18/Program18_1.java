class Logic
{
	void CheckPrime(int iNo)
	{
		int iCnt = 0;
		boolean bFlag = false; 

		if(iNo < 0)
	    {
	        iNo = -iNo;
	    }

		for(iCnt = 2, bFlag = true; iCnt <= iNo/2;iCnt++)
		{
			if((iNo % iCnt) == 0)
	        {
	            bFlag = false;
	            break;                                  		// Optimization
	        }
		}

		if (bFlag == true)
		{
			System.out.println("Number is Prime");	
		}
		else 
		{
			System.out.println("Number is Not Prime");	
		}
	}
}

// O(N/2)

class Program18_1
{
	public static void main(String args[])
	{
		Logic obj = new Logic();
		obj.CheckPrime(11);
	}
}