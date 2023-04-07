/*

.Write a program to convert state of Float instance into byte,
short, int, long, float and double.


*/

class AQ25
{
    public static void main(String args[])
    {
        float F = 99.99F;
        Float FL = new Float(F);

        byte b = FL.byteValue();
        System.out.println(b);

        short s = FL.shortValue();
        System.out.println(s);

        int i = FL.intValue();
        System.out.println(i);

        long l = FL.longValue();
        System.out.println(l);

        float f2 = FL.floatValue();
        System.out.println(f2);

        double d = FL.doubleValue();
        System.out.println(d);
    }
}
