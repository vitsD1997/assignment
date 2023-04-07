/*

.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.


*/


class AQ24
{
   public static void main(String args[])
   {
    float F = 99.99F;
    String s = Float.toString(F);
    System.out.println("float value to string= "+s);

    Float F1 = new Float(F);
    System.out.println("float value into float instance= "+ F1);

    Float F2 = new Float(s);
    System.out.println("string instance into float value "+ F2);

    String hex = Float.toHexString(F);
    System.out.println("float value into hexadecimal string= "+ hex);


    







   }
}