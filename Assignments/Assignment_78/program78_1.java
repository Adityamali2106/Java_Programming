import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program78_1
//      Description     : It is used to Calculate total bill of hotel.
//      Input           : Dayes stayes.
//      Output          : Total bill.
//      Author          : Aditya Vijay Mali
//      Date            : 06/03/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program78_1
{
    public static void main(String A[])
    {
        int Dayes = 0;
        int Bill = 0;
        float DescountedAmount = 0.0f;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter NUmber of dayes stayed : ");
        Dayes = sobj.nextInt();
        
        if (Dayes < 0)
        {
            System.out.println("Invalid Input ");
            return;    
        }

        Bill = Dayes * 3000;

        if (Dayes > 7)
        {
            DescountedAmount = (float)Bill * (float)0.05;     
        }

        System.out.println("Total Stay Duration : "+Dayes+" days");
        System.out.println("Final Bill Amount : "+(Bill - DescountedAmount));
    }
}