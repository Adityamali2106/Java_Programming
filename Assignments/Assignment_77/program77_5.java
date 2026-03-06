import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program77_5
//      Description     : It is used to seat booking with row Pricing + Group Discount.
//      Input           : Row, Cols, Booked Seat List, Requested Seat List.
//      Output          : Successful/Fail + Total Cost + Remaining seats
// .
//      Author          : Aditya Vijay Mali
//      Date            : 02/03/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program77_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int WeeksLate = 0;

        System.out.println("Enter Total units : ");
        Units = sobj.nextInt();

        System.out.println("If late to pay the bill please enter how many weeks late");
        WeeksLate = sobj.nextInt();

        double fixedCharge = 50.00;
        double baseBill = fixedCharge;

        if (Units <= 8) {
            baseBill = baseBill + Units * 7;
        } else if (Units <= 25) {
            baseBill = baseBill + (8 * 7) + (Units - 8) * 18;
        } else if (Units <= 50) {
            baseBill = baseBill + (8 * 7) + (17 * 18) + (Units - 25) * 36;
        } else {
            baseBill = baseBill + (8 * 7) + (17 * 18) + (25 * 36) + (Units - 50) * 50;
        }

        double penaltyRate = Math.min(WeeksLate * 0.02, 0.10);
        double lateFee = baseBill * penaltyRate;

        double totalBill = baseBill + lateFee;

        System.out.println("Base Bill: "+baseBill);
        System.out.println("Late Fee Penalty: "+lateFee);
        System.out.println("Total Amount Payable: "+totalBill);

        sobj.close();
    }
}
