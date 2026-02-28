import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program75_5
//      Description     : It is used to Calculate Total tax payable on annual income.
//      Input           : Annual Income.
//      Output          : Total Tax Payable. 
//      Author          : Aditya Vijay Mali
//      Date            : 27/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program75_5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int AnnualIncome = 0;
        float TaxPayable = 0.0f;

        System.out.println("Enter your Annual Income : ");
        AnnualIncome = sobj.nextInt();

        if (AnnualIncome < 0)
        {
            System.out.println("Income cannot be negative ");
            return;    
        }

        if (AnnualIncome <= 250000)
        {
            TaxPayable = 0.0f;    
        }
        else if (AnnualIncome > 250000 && AnnualIncome<= 500000)
        {
            TaxPayable = (((float)AnnualIncome -(float)250000) * (float)0.05);    
        }
        else if (AnnualIncome > 500000 && AnnualIncome <= 1000000)
        {
            TaxPayable = (((float)250000) * (float)0.05) + (((float)AnnualIncome - (float)500000) * (float)0.20);
        }
        else
        {
            TaxPayable = (((float)250000) * (float)0.05) + (((float)500000) * (float)0.20) + (((float)AnnualIncome - (float)1000000) * (float)0.30);
        }

        System.out.println("Annual Inclome : "+AnnualIncome);
        System.out.println("Total Tax Payable : "+TaxPayable);
        sobj.close();
    }
}