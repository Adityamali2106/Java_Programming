import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name 	    : Matrix
//  Discription 	: It is used to perform multiple operations on 2d Array
//  Author 			: Aditya Vijay Mali
//  Date 			: 23/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a,int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name 	: Accept
    //  Discription 	: It is used to accept the values from user and store it into matrix
    //  Input 			: Nothing
    //  Output 			: Nothing
    //  Author 			: Aditya Vijay Mali
    //  Date 			: 23/02/2026
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////


    public void Accept()
    {
        int i = 0,j = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of Matrix : ");

        for (i = 0; i < iRow; i++) 
        {
            System.out.println("Emter the elements of row : "+(i+1));
            for(j = 0;j < iCol;j++)
            {
                Arr[i][j] = sobj.nextInt();                
            }    
        }

        sobj.close();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name 	: Display
    //  Discription 	: It is used to Dispaly the values of matrix on screen
    //  Input 			: Nothing
    //  Output 			: Nothing
    //  Author 			: Aditya Vijay Mali
    //  Date 			: 23/02/2026
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void Display()
    {
        int i = 0,j = 0;

        System.out.println("elements of Matrix Are : ");

        for (i = 0; i < iRow; i++) 
        {
            for(j = 0;j < iCol;j++)
            {
                System.out.print(Arr[i][j]+"\t");      
            }
            System.out.println(); 
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name 	: ReverseRows
    //  Discription 	: It is used to reverse the each row of a marix
    //  Input 			: Nothing
    //  Output 			: Nothing
    //  Author 			: Aditya Vijay Mali
    //  Date 			: 23/02/2026
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void ReverseRows()
    {
        int i = 0,j = 0;
        int iTemp = 0;

        for (i = 0; i < iRow; i++) 
        {
            for (j = 0; j < iCol / 2; j++) 
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[i][iCol - 1 - j];
                Arr[i][iCol - 1 - j] = iTemp;
            }
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name 	    : program73_2
//  Discription 	: It is the entry point class for the application
//  Author 			: Aditya Vijay Mali
//  Date 			: 23/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////


class program73_2
{
    public static void main(String A[]) 
    {
        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        mobj.Display();

        mobj.ReverseRows();
        System.out.println("After Reversing each Row of Matrix is : ");
        mobj.Display();
    }
}