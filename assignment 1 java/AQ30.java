/*
Write a program to find minimum and maximum number as well as
to add two double numbers using methods of Double.

*/

class AQ30
{
    public static void main(String args[])
    {
        Double D1=9999999.999999D;
        Double D2=9999.9999D;
        System.out.println("Maximum value is= "+Double.max(D1,D2));
        System.out.println("Minimum value is= "+Double.min(D1,D2));
        System.out.println("Addition is= "+Double.sum(D1,D2));
    }
}