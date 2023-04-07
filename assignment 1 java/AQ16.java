/*
Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.
*/

class AQ16
{
    public static void main(String args[])
    {
       // integer to string
   
       int i = 99;
       String s= Integer.toString(i);
       System.out.println("Integer to string= "+s);

       // int value into integer instance

       Integer a = new Integer(i);
       System.out.println(a);

       //String instance into integer instance

       Integer b = new Integer(s);
       System.out.println(s);

       // int value to binary string

       String str1 = Integer.toBinaryString(i);
       System.out.println("int to binary string="+str1);

       String str2 = Integer.toHexString(i);
       System.out.println("int to ocatl string="+str2);

       String str3 = Integer.toOctalString(i);
       System.out.println("int to hexadecimle string="+str3);



    }
}