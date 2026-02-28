import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program76_4
//      Description     : It is used to check the cashier wants to know how many items 
//                        can be purchased befor mony becomes insufficient.
//      Input           : Parcel weight
//      Output          : Total Courier Charge.
//      Author          : Aditya Vijay Mali
//      Date            : 27/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program76_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Budget = 0;
        int NumberofItems = 0;
        int iCnt = 0;
        int iSum = 0;
        
        System.out.println("Enter your bufget amount : ");
        Budget = sobj.nextInt();

        System.out.println("Number of Items perchased : ");
        NumberofItems = sobj.nextInt();

        if (Budget > 0 || NumberofItems < 0)
        {
            System.out.println("Invalid Input");
            return;    
        }

        int Arr[] = new int[NumberofItems];

        for(iCnt = 0; iCnt < NumberofItems; iCnt++)
        {
            System.out.println("Enter "+iCnt+" Value " );
            Arr[iCnt] = sobj.nextInt();

            if (Arr[iCnt] < 0)
            {
                System.out.println("Invalid Input");
                return;    
            }

            iSum = iSum + Arr[iCnt];
        }

        System.out.println("Items Purchased : "+NumberofItems);
        System.out.println("Remaining Balance : "+(iSum - Budget));        

        sobj.close();
    }
}