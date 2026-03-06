import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program78_5
//      Description     : it is used to calculate total call charge based on call diration
//      Input           : Call Duration.
//      Output          : total call charge.
//      Author          : Aditya Vijay Mali
//      Date            : 06/03/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program78_5
{
    public static void main(String A[])
    {
        int CallDuretion = 0;
        int CallCharge = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter call duration is minutes : ");
        CallDuretion = sobj.nextInt();

        if (CallDuretion < 0)
        {
            System.out.println("Invalid Input ");
            return;    
        }

        if (CallDuretion <= 5)
        {
            CallCharge = 0;    
        }
        else if (CallDuretion > 5 && CallDuretion <= 15)
        {
            CallCharge = (CallDuretion - 5) * 1;    
        }
        else if (CallDuretion > 15)
        {
            CallCharge = 10 + ((CallDuretion - 15) * 2);              
        }

        System.out.println("Call Duration : "+CallDuretion+" minutes");
        System.out.println("Total call Charge : "+CallCharge);

    }
}