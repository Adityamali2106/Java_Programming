import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program75_4
//      Description     : It is used to Calculate the fine when rider violated traffic rules.
//      Input           : Helmet worm, license available and Overspeeding(Yes/ NO).
//      Output          : Total fine amount. 
//      Author          : Aditya Vijay Mali
//      Date            : 27/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program75_4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String HelmetWorm = null;
        String LicemseAvailable = null;
        String Overspeeding = null;

        int Fine = 0;

        System.out.println("Helmet worm (YES/NO)");
        HelmetWorm = sobj.next();

        System.out.println("License Available (Yes/No) : ");
        LicemseAvailable = sobj.next();

        System.out.println("Overspeeding (Yes/No) : ");
        Overspeeding = sobj.next();

        if (
            ((HelmetWorm.equalsIgnoreCase("Yes") == false) &&
            (HelmetWorm.equalsIgnoreCase("No") == false)) 
            ||
            ((LicemseAvailable.equalsIgnoreCase("Yes") == false) &&
            (LicemseAvailable.equalsIgnoreCase("No") == false))
            ||
            ((Overspeeding.equalsIgnoreCase("Yes") == false) &&
            (Overspeeding.equalsIgnoreCase("No") == false))
            )
        {
            System.out.println("Input must br Yes/No Only ");
            return;
        }

        if (HelmetWorm.equalsIgnoreCase("Yes"))
        {
            Fine = Fine + 500;    
        }
        
        if(LicemseAvailable.equalsIgnoreCase("Yes"))
        {
            Fine = Fine + 1000;
        }
        
        if(Overspeeding.equalsIgnoreCase("Yes"))
        {
            Fine = Fine + 1500;
        }

        System.out.println("Total Fine Amount : "+Fine);
            
        sobj.close();
    }
}