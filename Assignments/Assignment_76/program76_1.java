import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program76_1
//      Description     : It is used to calculate fare based on distance & whether 
//                        the trip happened during peak hours.
//      Input           : Total Distance in KM and Peak hours (Yes/No)
//      Output          : Total Fare
//      Author          : Aditya Vijay Mali
//      Date            : 27/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program76_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int fare = 50;
        float PeakHourFare = 0.0f;

        System.out.println("Enter Destance in km : ");
        int km = sobj.nextInt();

        System.out.println("Peak hour (Yes/No): ");
        String PeakHour = sobj.next();

        if (km < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if ((PeakHour.equalsIgnoreCase("Yes") == false) &&
            (PeakHour.equalsIgnoreCase("No") == false) 
            ) 
        {
            System.out.println("Invalid Input");
            return;
        }

        if (km <= 10)
        {
            fare = 50 + (km * 12);    
        }
        else if(km > 10)
        {
            fare = 170 + ((km -10) * 15);
        }

        if (PeakHour.equalsIgnoreCase("Yes"))
        {
            PeakHourFare = (float)fare * (float)1.2;    
        }
        else
        {
            PeakHourFare = (float)fare;
        }

        System.out.println("Distance : "+km+" km");
        System.out.println("Peal Hour : "+PeakHour);
        System.out.println("Total Fare : "+PeakHourFare);

        sobj.close();
    }
}