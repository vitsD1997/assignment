/*
Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
*/

class A_Q8
{
    public static void main(String args[])
    {
       byte b=11;
       System.out.println("Byte value to string "+ Byte.toString(b)); 


// byte value into byte instance
        Byte b1=Byte.valueOf(b);
        System.out.println("byte value into Byte instance = "+b1);

//String instance into Byte instance.

        String str="17";
        Byte b2=Byte.valueOf(str);
        System.out.println("String instance into Byte instance = "+b2);


    }
}