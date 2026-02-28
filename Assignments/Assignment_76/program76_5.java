import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program76_5
//      Description     : It is used to show different battery warnings.
//      Input           : Battery persentage
//      Output          : Buttary status.
//      Author          : Aditya Vijay Mali
//      Date            : 27/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program76_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int BatteryPercentage = 0;

        System.out.println("Enter your bufget amount : ");
        BatteryPercentage = sobj.nextInt();

        if (BatteryPercentage < 0 || BatteryPercentage > 100)
        {
            System.out.println("Invalid Input");
            return;    
        }

        System.out.println("Battery Percentage : "+BatteryPercentage+"%");    

        if (BatteryPercentage <= 5)
        {
            System.out.println("Status : Critical");
        }
        else if(BatteryPercentage > 5 && BatteryPercentage <= 15)
        {
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Status : Normal");
        }

        sobj.close();
    }
}