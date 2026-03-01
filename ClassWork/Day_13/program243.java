import java.util.*;

class program243
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        for(iCnt = 0;iCnt < str.length();iCnt++)
        {
            System.out.println(str.charAt(iCnt));
        }

    }
}