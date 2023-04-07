/*
Write a program to convert state of Short instance into byte,
short, int, long, float and double.
*/

class AQ14
{
    public static void main(String args[])
    {
        Short s=10;
        Short s1 = new Short(s);
        System.out.println(s);
        byte b1= s1.byteValue();
        System.out.println("convert state of Byte instance into byte = "+b1);
        short sh=s1.shortValue();
        System.out.println("convert state of Byte instance into short = "+sh);
        int a=s1.intValue();
        System.out.println("convert state of Byte instance into int = "+a);
        Long l=s1.longValue();
        System.out.println("convert state of Byte instance into long = "+l);
        float f=s1.floatValue();
        System.out.println("convert state of Byte instance into float = "+f);
        double d=s1.doubleValue();
        System.out.println("convert state of Byte instance into double = "+d);
    }
}