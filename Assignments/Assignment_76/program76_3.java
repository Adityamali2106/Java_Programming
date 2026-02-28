import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program76_3
//      Description     : It is used to calculates delivery charge by weight.
//      Input           : Parcel weight
//      Output          : Total Courier Charge.
//      Author          : Aditya Vijay Mali
//      Date            : 27/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program76_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int ParcelWeight = 0;
        int CourierCharge = 0;

        System.out.println("Enter Parcel weight in kg : ");
        ParcelWeight = sobj.nextInt();

        if (ParcelWeight < 0)
        {
            System.out.println("Invalid Input");
            return;    
        }

        if (ParcelWeight <= 1)
        {
            CourierCharge = 50;    
        }
        else if (ParcelWeight > 1 && ParcelWeight <= 5)
        {
            CourierCharge = 50 + ((ParcelWeight - 1) * 20);    
        }
        else if (ParcelWeight > 5)
        {
            CourierCharge = 150 + ((ParcelWeight - 5)* 30);
        }

        System.out.println("Parcel Weight : "+ParcelWeight+" kg");
        System.out.println("Courier Charge : "+CourierCharge);

        sobj.close();
    }
}