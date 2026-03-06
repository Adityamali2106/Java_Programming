import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program78_3
//      Description     : It is used to record steps for 7 dayes, show how many dayes achived 
//                        the goal and what the highest step count.
//      Input           : 7 dayes step count.
//      Output          : Goal achieved dayes, maximum Steps.
//      Author          : Aditya Vijay Mali
//      Date            : 06/03/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program78_3
{
    public static void main(String A[])
    {
        int StepCoiunt[] = new int[7];
        int Goal = 0;
        int iMax = 0;
        int GoalCount = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your step count goal to achive : ");
        Goal = sobj.nextInt();

        for (int i = 0; i < StepCoiunt.length; i++)
        {
            System.out.println("enter "+(i+1)+" day Step count : ");
            StepCoiunt[i] = sobj.nextInt();
            
            if (StepCoiunt[i] <= 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            if (iMax < StepCoiunt[i])
            {
                iMax = StepCoiunt[i];    
            }

            if (StepCoiunt[i] > Goal)
            {
                GoalCount++;
            }
        }

        System.out.println("Goal Achieved Dayes : "+GoalCount);
        System.out.println("Maximum steps in week : "+iMax);
    }
}