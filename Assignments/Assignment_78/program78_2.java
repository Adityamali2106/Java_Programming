import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program78_2
//      Description     : It is used check the duplicate voter is and cancel its vote.
//      Input           : Number of votes N, Nvoter Ids.
//      Output          : Valid vots, rejected duplivate voytes.
//      Author          : Aditya Vijay Mali
//      Date            : 06/03/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program78_2
{
    public static void main(String A[])
    {
        int NumberOfVotes = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of vots : ");
        NumberOfVotes = sobj.nextInt();
        
        if (NumberOfVotes <= 0)
        {
            System.out.println("Invalid Input ");
            return;    
        }

        int IDs[] = new int[NumberOfVotes];

        for (int i = 0; i < NumberOfVotes; i++)
        {
            System.out.println("Enter "+(i+1)+" voters ID : ");
            IDs[i] = sobj.nextInt();
            
            if (IDs[i] < 0)
            {
                System.out.println("Invalid Input");
                return;
            }
        }

        int Actualvotes = NumberOfVotes;
        
        for(int i = 0;i < IDs.length;i++)
        {
            if (IDs[i] != 0) 
            {
                for(int j = 0; j < IDs.length;j++)
                {
                    if (IDs[i] == IDs[j] && i != j && IDs[j] != 0)
                    {
                        Actualvotes--;
                        IDs[j] = 0;
                    }
                }
            }
        }

        System.out.println("Valid Votes : "+Actualvotes);
        System.out.println("Rejected Duplicate Votes : "+(NumberOfVotes - Actualvotes));
    }
}