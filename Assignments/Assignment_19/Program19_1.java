class Logic
{
    void CheckLeapYear(int iNo)
    {
        if (((iNo % 4 == 0) && (iNo % 100 != 0)) || (iNo % 400 == 0))
        {
            System.out.println("Leep Year");
        }
        else
        {
            System.out.println("Not a Leep Year");
        } 
    }
}

class Program19_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckLeapYear(2024);
    }
}