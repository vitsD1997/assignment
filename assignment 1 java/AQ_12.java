/*

a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short

*/

class AQ_12
{
    public static void main(String args[])
    {
        short s = 1;
        System.out.println("The number of bits used to represent a short value "+Short.SIZE);
        System.out.println("The number of bytes used to represent a short value "+Short.BYTES);
        System.out.println("The minimum value of a short "+Short.MAX_VALUE);
        System.out.println("The maximum value of a short "+Short.MIN_VALUE);

    }
}

