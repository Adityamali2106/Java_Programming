// OOP Design

import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;

    public ArrayX(int iNo)
    {
        System.out.println("Inside Constructor");
        iSize = iNo;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;

        System.out.println("Engter the Elements of Array");

        for (i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of the Array are : ");
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class program106
{
    public static void main(String A[])
    {
        ArrayX aobj1 = new ArrayX(5);
        System.out.println(aobj1.iSize);                                // Error

        // Bad Code (Need of Access Spacifire)
        aobj1.iSize = 11;                                               // Error
        aobj1.Arr = null;                                               // Error

        ArrayX aobj2 = new ArrayX(7);
        System.out.println(aobj2.iSize);                                // Error
    }
}
