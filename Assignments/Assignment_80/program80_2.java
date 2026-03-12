import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program80_2
//      Description     : it is used to check the given matrix is a magic square or not.
//      Input           : Number of rows, number of columns, element value of each element.
//      Output          : Matrix is a magic square or not.
//      Author          : Aditya Vijay Mali
//      Date            : 06/03/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class program80_2
{
    public static void main(String A[])
    {
        int iSize = 0;
        int i = 0;
        int j = 0;


        Scanner sobj = new Scanner(System.in);
    
        System.out.println("Enter First Line : ");
        iSize = sobj.nextInt();

        if (iSize < 0)
        {
            System.out.println("Invalid Input");
            return;    
        }

        int Arr[][] = new int[iSize][iSize];
        int iRowSum[] = new int[iSize];
        int iColSum[] = new int[iSize];
        int firstDigonalSum = 0;
        int SecoundDigonalSum = 0;
        boolean bflag = true;

        for (i = 0; i < iSize; i++)
        {
            System.out.println("Enter "+i+"Row Elements ");
            for (j = 0; j < iSize; j++)
            {
                Arr[i][j] = sobj.nextInt();

                iRowSum[i] = iRowSum[i] + Arr[i][j];

                if (i == j )
                {
                    firstDigonalSum = firstDigonalSum + Arr[i][j];
                }

                if ((i + j) == iSize-1)
                {
                    SecoundDigonalSum = SecoundDigonalSum + Arr[i][j];    
                }
            }
        }

        for (i = 0; i < iSize; i++)
        {
            for (j = 0; j < iSize; j++)
            {
                iColSum[i] = iColSum[i]+ Arr[j][i]; 
            }    
        }

        for (i = 0; i < iSize-1; i++)
        {
            if (iRowSum[i] != iRowSum[i+1])
            {
                bflag = false;    
            }

            if (iColSum[i] != iColSum[i+1])
            {
                bflag = false;    
            }
        }

        if (firstDigonalSum != SecoundDigonalSum)
        {
            bflag = false;    
        }

        if (bflag)
        {
            System.out.println("Matrix is a Magic Square");    
        }
        else
        {
            System.out.println("Matrix is NOT a Magic Square");    
        }
    }
}
