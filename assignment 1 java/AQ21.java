/*

Write a program to convert state of Long instance into byte,
short, int, long, float and double.

*/

class AQ21
{
    public static void main(String args[])
    {
        Long L = 999999L;

        Long L1 = new Long(L);

        byte b = L1.byteValue();
        System.out.println(b);

        short s = L1.shortValue();
        System.out.println(s);

        int i = L1.intValue();
        System.out.println(i);

        long l2 = L1.longValue();
        System.out.println(l2);

        float f = L1.floatValue();
        System.out.println(f);

        double d = L1.doubleValue();
        System.out.println(d);
    }
}

