import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program77_2
//      Description     : It is used to Calculate total charges of train booking.
//      Input           : Distance. class type, Booking hours before and age
//      Output          : Total Charge.
//      Author          : Aditya Vijay Mali
//      Date            : 02/03/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program77_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        String ClassType = null;
        int BookingHoursBefor = 0;
        int Age = 0;
        int TotalCharge = 0;
        float FinalPayable = 0.0f;

        System.out.println("Enter total Distance : ");
        Distance = sobj.nextInt();

        System.out.println("Enter Class type (Sleeper/3AC/2AC) : ");
        ClassType = sobj.next();

        System.out.println("Enter Booking Hours Befor :" );
        BookingHoursBefor = sobj.nextInt();

        System.out.println("Enter Your age : ");
        Age = sobj.nextInt();

        if (Distance < 0 || Age < 0 || BookingHoursBefor < 0)
        {
            System.out.println("Invalid Input");
            return;    
        }

        if ((ClassType.equalsIgnoreCase("Sleeper") == false &&
             ClassType.equalsIgnoreCase("3AC") == false &&
             ClassType.equalsIgnoreCase("2AC") == false )
            )
        {
            System.out.println("Invalid Input");
            return;    
        }

        if (ClassType.equalsIgnoreCase("Sleeper"))
        {
            TotalCharge = Distance * 20;    
        }
        else if(ClassType.equalsIgnoreCase("3AC") || ClassType.equalsIgnoreCase("2AC"))
        {
            TotalCharge = Distance * 40;
        }

        if (BookingHoursBefor < 24)
        {
            FinalPayable = (float)TotalCharge *(float)0.3;
        }
        else
        {
            FinalPayable = TotalCharge;
        }

        if (Age >= 65)
        {
            FinalPayable = (float)TotalCharge / (float)0.4;  
        }
        else
        {
            FinalPayable = TotalCharge;
        }


        System.out.println("Final Payable : "+FinalPayable);

        sobj.close();
    }
}