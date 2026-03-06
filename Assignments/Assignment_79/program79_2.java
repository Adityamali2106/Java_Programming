import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program79_2
//      Description     : it is used to manage cinemahall seating using 2D array.
//      Input           : Number of rows, number of columns, seet booked or not(0/1).
//      Output          : Total booked seets,row with maximum bookings, full row exists(yes/no).
//      Author          : Aditya Vijay Mali
//      Date            : 06/03/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program79_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows in theatre : ");
        int R = sobj.nextInt();
        System.out.println("Enter number of columns in theatre : ");
        int C = sobj.nextInt();

        int TotalBooked = 0;
        int MaxedBookedInRow = 0;
        int RowWithMax = 0;
        Boolean FullRowExist = false;
        int RowBooked = 0;

        if (R <= 0  || C <= 0)
        {
            System.out.println("Invalid Input");
            return;    
        }

        int Seets[][] = new int[R][C];
        int i = 0,j = 0;

        System.out.println("Enter Booking details (0/1) ");

        for (i = 0; i < R; i++)
        {
            System.out.println("Enter details of Row : "+(i + 1));
            for (j = 0; j < C; j++) 
            {
                Seets[i][j] = sobj.nextInt();
                
                if (Seets[i][j] != 0 && Seets[i][j] != 1)
                {
                    System.out.println("Invalid input");
                    return;
                }
            }    
        }

        for(i = 0; i < R; i++)
        {
            RowBooked = 0;
            for(j = 0; j < C;j++)
            {
                if (Seets[i][j] == 1)
                {
                    TotalBooked++;    
                }
                RowBooked = RowBooked + Seets[i][j];
            }

            if (RowBooked > MaxedBookedInRow)
            {
                MaxedBookedInRow = RowBooked;
                RowWithMax = i;    
            }

            if (RowBooked == C)
            {
                FullRowExist = true;    
            }
        }

        System.out.println("Total Booked seets : "+TotalBooked);
        System.out.println("Row With Maximum Bookings : "+(RowWithMax + 1));

        System.out.println("Full row exist : "+(FullRowExist ? "Yes" : "No"));

        sobj.close();
    }
}