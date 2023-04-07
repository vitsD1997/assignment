/*
Write a program to find minimum and maximum number as well as
to add two float numbers using methods of Float.
*/

class AQ26
{
    public static void main(String args[])
    {
        float a=999.999F;
        float b=99.99F;
        System.out.println("Maximum value is= "+Float.max(a,b));
        System.out.println("Minimum value is= "+Float.min(a,b));
        System.out.println("Addition is= "+Float.sum(a,b));
    }
}