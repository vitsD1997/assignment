/*

Write a program to convert state of Double instance into byte,
short, int, long, float and double.

*/


class AQ29
{

    public static void main(String args[])
    {
        double D = 999999.99999D;
        Double D1 = new Double(D);

        byte b = D1.byteValue();
        System.out.println(b);

        short s = D1.shortValue();
        System.out.println(s);

        int i = D1.intValue();
        System.out.println(i);

        long l = D1.longValue();
        System.out.println(l);

        float fl = D1.floatValue();
        System.out.println(fl);

        double dl1 = D1.doubleValue();
        System.out.println(dl1);
    }
}