/*

Write a program to perform below operations on long type to
get:
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long

*/

class AQ19
{
    public static void main (String args[])
    {
       System.out.println("bits used to represent a long value = "+Long.BYTES);
       System.out.println("number of bytes used to represent a Long value = "+Long.BYTES);
       System.out.println("The minimum value a Long = "+Long.MIN_VALUE);
       System.out.println("The maximum value a Long = "+Long.MAX_VALUE);
    }
}