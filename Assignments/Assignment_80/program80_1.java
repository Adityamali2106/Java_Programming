import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program80_1
//      Description     : it is used to analyze electricity cousumption of multiple cities over a week.
//      Input           : Number of cites, units per day(7 day in a week) of each city.
//      Output          : Multiple outputs.
//      Author          : Aditya Vijay Mali
//      Date            : 06/03/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program80_1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int N = 0;
        int i = 0, j = 0, no = 0;

        int Weekly[] = new int[7];
        int HighestCity = 0;
        int MaxWeekly = 0;

        int PeekDay = 0;
        int MaxDayTotal = 0;
        int Sum = 0;

        int DaySum = 0;
        int Day = 0;


        System.out.println("Enter number of cities : ");
        N = sobj.nextInt();

        if (N <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[N][7];

        System.out.println("Enter electicity Cunsumption of each city");

        for (i = 0; i < N; i++) 
        {
            System.out.println("Enter consumption of city : "+(i+1));
            for (j = 0; j < 7; j++) 
            {
                no = sobj.nextInt();
                if (no < 0)
                {
                    System.out.println("Invalid Input");
                    return;    
                }

                Arr[i][j] = no;
            }
        }

        for (i = 0; i < N; i++)
        {
            Sum = 0;
            for(j = 0; j < 7; j++)
            {
                Sum = Sum + Arr[i][j];
            }
            Weekly[i] = Sum;
            if (Sum > MaxWeekly)
            {
                MaxWeekly = Sum;
                HighestCity = i;    
            }
        }

        System.out.println("Highest consumption : City "+HighestCity);
        System.out.println("Highest Consumtion : "+MaxWeekly);

        // Day with maximum cunsumption

        for(Day = 0;Day < 7;Day++)
        {
            DaySum = 0;
            for(i = 0; i < N;i++)
            {
                DaySum = DaySum + Arr[i][Day];
            }
            if (DaySum > MaxDayTotal)
            {
                MaxDayTotal = DaySum;
                PeekDay = Day;    
            }
        }

        System.out.println("Peak consumption day : "+PeekDay);
        System.out.println("Weekly consumption : ");

        for(i = 0; i< N;i++)
        {
            System.out.println("City : "+(i+1)+" : "+Weekly[i]);
        }

        // Cities more than 500 consumption

        System.out.println("Cities more than 500 consumption : ");
        for(i = 0; i < N;i++)
        {
            if (Weekly[i] > 500)
            {
                System.out.println("City : "+(i + 1));
            }
        }

        sobj.close();
    }

}
