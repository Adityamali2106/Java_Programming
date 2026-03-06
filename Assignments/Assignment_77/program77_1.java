import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program77_1
//      Description     : It is used to Calculate total bill of hospital.
//      Input           : Dayes, ward Type, Medicine Bill, Consulation fee, Insured
//      Output          : Total bill.
//      Author          : Aditya Vijay Mali
//      Date            : 02/03/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program77_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Days = 0;
        String WardType = null;
        int MedicineBill = 0;
        int ConsultationFee = 0;
        String Insured = null;
        int TotalCharge = 0;
        float FinalPayable = 0.0f; 
        float InsuranceCover = 0.0f;
 
        System.out.println("Enter total dayes : ");
        Days = sobj.nextInt();

        System.out.println("Enter ward type (Normal/ICU) : ");
        WardType = sobj.next();

        System.out.println("Enter Medicine Bill : ");
        MedicineBill = sobj.nextInt();

        System.out.println("Enter consultation Fees : ");
        ConsultationFee = sobj.nextInt();

        System.out.println("Insurance is avalable (Yes/No) : ");
        Insured = sobj.next();

        if (Days < 0 || MedicineBill < 0 || ConsultationFee < 0)
        {
            System.out.println("Invalid Input");
            return;    
        }

        if ((WardType.equalsIgnoreCase("Normal") == false &&
             WardType.equalsIgnoreCase("ICU") == false) ||
            (Insured.equalsIgnoreCase("Yes") == false &&
             Insured.equalsIgnoreCase("No") == false)
            )
        {
            System.out.println("Invalid Input");
            return;    
        }

        if (WardType.equalsIgnoreCase("Normal"))
        {
            TotalCharge = Days * 2000;    
        }
        else if(WardType.equalsIgnoreCase("ICU"))
        {
            TotalCharge = Days * 5000;
        }

        TotalCharge = TotalCharge + MedicineBill + ConsultationFee;

        if (Insured.equalsIgnoreCase("Yes"))
        {
                if (50000 < (TotalCharge * 0.70))
                {
                    InsuranceCover = 50000;
                }
                else
                {
                    InsuranceCover = (float) TotalCharge* (float)0.70;
                }
            FinalPayable = TotalCharge - InsuranceCover;
        }
        else
        {
            FinalPayable = TotalCharge;
        }


        System.out.println("Total Bill : "+TotalCharge);
        System.out.println("Insurance Cover : "+ InsuranceCover);
        System.out.println("Final Payable : "+FinalPayable);

        sobj.close();
    }
}