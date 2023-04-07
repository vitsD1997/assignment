/*

Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.

*/
class AQ20 
{
    public static void main(String args[])
    {
        // long value into string

        long L=99999999;
        String s = Long.toString(L);
        System.out.println("long to string= "+s);

        // long value into long instance

        Long L1 = new Long(L);
        System.out.println("long value into long instance= "+L1);

        // String instance into long instance

        Long L2 = new Long(s);
        System.out.println("Sring instance into long instance= "+L2);

        // Long Value into binary string

        String str1 = Long.toBinaryString(L);
        System.out.println("long to binary= "+str1);

        //Long Value to hexadecimal string

        String str2 = Long.toHexString(L);
        System.out.println("Long to hex string= "+str2);

        // Long value to octal string

        String str3 = Long.toOctalString(L);
        System.out.println("long to octal= "+str3);
        




    }
}