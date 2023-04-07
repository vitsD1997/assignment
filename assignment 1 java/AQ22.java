/*

Write a program to find minimum and maximum number as well as
to add two long numbers using methods of Long.

*/

class AQ22
{
    public static void main(String args[])
    {
        Long L1 = 999999999L;
        Long L2 = 9999999L;

        System.out.println("Maximum number is= "+ Long.max(L1, L2));
        System.out.println("Minimum number is= "+ Long.min(L1, L2));
        System.out.println("Addition is= "+ Long.sum(L1, L2));



    }
}



