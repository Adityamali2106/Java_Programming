import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program76_2
//      Description     : It is used to check student qualify the scholarship based on all academic and financial conditions.
//      Input           : Marks,Attendance and family income
//      Output          : Scholarship Approved or rejected
//      Author          : Aditya Vijay Mali
//      Date            : 27/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program76_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Marks = 0;
        int Attendance = 0;
        int FamilyIncome = 0;

        System.out.println("Enter total marks : ");
        Marks = sobj.nextInt();

        System.out.println("Emnter attendance in percent : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter Family income ");
        FamilyIncome = sobj.nextInt();

        if ((Marks < 0 || Marks > 100) || FamilyIncome < 0 || (Attendance <0 || Attendance > 100))
        {
            System.out.println("Invalid Input");
            return;    
        }

        if (Marks <= 80 )
        {
            System.out.println("Scholarship Rejected : Marks are less than 80%");    
        }
        else if(Attendance <= 75)
        {
            System.out.println("Scholarship Rejected : Attendance is less than 75%");    
        }
        else if(FamilyIncome >= 300000)
        {
            System.out.println("Scholarship Rejected : Family Income is more than 3,00,000rs ");    
        }
        else
        {
            System.out.println("Scholarship Approved");    
        }

        sobj.close();
    }
}