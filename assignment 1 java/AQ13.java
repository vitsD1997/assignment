/*

Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.

*/


class AQ13 
{
    public static void main(String args[])
    {
        Short s=10;
        String s1=Short.toString(s);
        System.out.println("Short to string= "+s1);

        Short ss = new Short(s);
        System.out.println("Short value in short instance"+ss);

        Short s3 = new Short(s1);
        System.out.println("String instance in short valeu");

    }

}