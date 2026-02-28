import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program75_2
//      Description     : It is used to check the customer is eligible for personal loan or not.
//      Input           : Coustomer age, Monthly income,Credit soce, Exissting unpaid loan(YES/NO)
//      Output          : Eligible or not
//      Author          : Aditya Vijay Mali
//      Date            : 27/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program75_2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int Age = 0;
        int MonthlyIncome = 0;
        int CreditScore = 0;
        String ExistingLoan = null;

        System.out.println("Enter youre Age : ");
        Age = sobj.nextInt();

        System.out.println("Enter your monthly income : ");
        MonthlyIncome = sobj.nextInt();

        System.out.println("Enter your Credit score : ");
        CreditScore = sobj.nextInt();

        System.out.println("You have any Existing unpaid loan (Yes/No): ");
        ExistingLoan = sobj.next();

        if (Age < 0 || MonthlyIncome < 0 || CreditScore < 0 ||
            ((ExistingLoan.equalsIgnoreCase("Yes") == false) &&
            (ExistingLoan.equalsIgnoreCase("No") == false)))
        {
            System.out.println("Invalid Input");
            return;    
        }

        if(Age < 21) 
        {
            System.out.println("Loan Rejected : Age must be greater then 21 years");
        }
        else if (Age > 60)
        {
            System.out.println("Loan Rejected : Age must be Less then 60 years");
        }
        else if (MonthlyIncome < 25000) 
        {
            System.out.println("Loan Rejected : Monthly Income must be greater then 25000");
        }
        else if(CreditScore <= 700)
        {
            System.out.println("Loan Rejected : Credit Score must be greater than 700");
        }
        else if (ExistingLoan.equalsIgnoreCase("No"))
        {
            System.out.println("Loan Rejected : There should not be any unpaid loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }
        
        sobj.close();
    }
}