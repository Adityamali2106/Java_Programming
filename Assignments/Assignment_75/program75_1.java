import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program75_1
//      Description     : It is used to calculate charges based on the total hours a vehicle stayed.
//      Input           : Total Parking hours
//      Output          : Total parking Fee
//      Author          : Aditya Vijay Mali
//      Date            : 27/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program75_1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int Hours = 0;
        int Charge = 0;
        System.out.println("Enter Total parking hours (Integer) : ");
        Hours = sobj.nextInt();

        if (Hours < 0)
        {
            System.out.println("Hours cannot be negative ");
            return;    
        }

        if (Hours <= 2)
        {
            Charge = 20;    
        }
        else if ( Hours > 2 && Hours <= 10)
        {
            Charge = Hours * 10;    
        }
        else
        {
            Charge = (Hours * 10) + 50;
        }

        System.out.println("Total Parking Duration : "+Hours+" hours");
        System.out.println("Total Parking Fee: "+Charge);

        sobj.close();
    }
}