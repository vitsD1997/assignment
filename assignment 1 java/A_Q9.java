//Write a program to convert state of Byte instance into byte,
//short, int. long, float and double.

class A_Q9
{
    public static void main(String args[])
    {
        Byte b=new Byte((byte)122);
        System.out.println(b);
        byte b1= b.byteValue();
        System.out.println("convert state of Byte instance into byte = "+b1);
        short sh=b.shortValue();
        System.out.println("convert state of Byte instance into short = "+sh);
        int a=b.intValue();
        System.out.println("convert state of Byte instance into int = "+a);
        Long l=b.longValue();
        System.out.println("convert state of Byte instance into long = "+l);
        float f=b.floatValue();
        System.out.println("convert state of Byte instance into float = "+f);
        double d=b.doubleValue();
        System.out.println("convert state of Byte instance into double = "+d);
    }
}