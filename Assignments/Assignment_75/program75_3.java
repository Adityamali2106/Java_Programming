import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program75_3
//      Description     : It is used to the customer placed order fulfill or not.
//      Input           : Current Stock and Requested Quentity.
//      Output          : Order Fulfill or not
//      Author          : Aditya Vijay Mali
//      Date            : 27/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program75_3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int CurrentStock = 0;
        int RequestedQuantity = 0;
        
        System.out.println("Enter Current stock : ");
        CurrentStock = sobj.nextInt();

        System.out.println("Enter The quentity customer want's : ");
        RequestedQuantity = sobj.nextInt();

        if (CurrentStock < 0)
        {
            System.out.println("Stock cannot be negatice");
            return;    
        }
        else if (RequestedQuantity <= 0)
        {
            System.out.println("Requested quentity must be > 0");
        }

        if (RequestedQuantity > CurrentStock)
        {
            System.out.println("Order Faild: Insufficient Stock");
            return;    
        }
        else
        {
            System.out.println("Order Processed Successfully. ");
            CurrentStock = CurrentStock - RequestedQuantity;

            System.out.println("Remaining Stock : "+CurrentStock);

            if (CurrentStock < 5)
            {
                System.out.println("Low Stock Alert!");
            }            
        }
        sobj.close();
    }
}