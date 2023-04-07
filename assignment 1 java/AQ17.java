/*
Write a program to convert state of Integer instance into
byte, short, int, long, float and double.
*/

class AQ17
{
    public static void main(String args[])
    {
        int i = 9999;
        Integer a = new Integer(i);

        byte b = a.byteValue();
        System.out.println(b);

        short s = a.shortValue();
        System.out.println(s);

        int a2 = a.intValue();
        System.out.println(a2);

        long l = a.longValue();
        System.out.println(l);

        float f = a.floatValue();
        System.out.println(f);

        double d = a.doubleValue();
        System.out.println(d);


    }
}