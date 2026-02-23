import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name 	    : Matrix
//  Discription 	: It is used to perform multiple operations on 2d Array
//  Author 			: Aditya Vijay Mali
//  Date 			: 23/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////

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
    //  Function Name 	: AddColumn
    //  Discription 	: It is used to Display the Addition of each cloumn of matrix
    //  Input 			: Nothing
    //  Output 			: Nothing
    //  Author 			: Aditya Vijay Mali
    //  Date 			: 23/02/2026
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void AddColumn()
    {
        int i = 0,j = 0;
        int iSum[] = new int[iCol];
        
        for (i = 0; i < iRow; i++) 
        {
            for(j = 0;j < iCol;j++)
            {
                iSum[j] = iSum[j] + Arr[i][j];
            }
        }

        for(j = 0; j < iCol; j++)
        {
            System.out.println("Addition of "+j+" Column is : "+iSum[j]);
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name 	    : program72_4
//  Discription 	: It is the entry point class for the application
//  Author 			: Aditya Vijay Mali
//  Date 			: 23/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////

class program72_4
{
    public static void main(String A[]) 
    {
        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        mobj.Display();

        System.out.println("Addition of all columns are : \n ");
        mobj.AddColumn();
    }
}