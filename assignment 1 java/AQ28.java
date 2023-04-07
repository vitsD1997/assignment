/*

.    Write a program to convert:
a.  double value into String
b.  double value into Double instance.
c.  String instance into Double instance.
d.  double value into binary, octal and hexadecimal
    string(Note: Here you can use doubleToLongBits() method
    along with methods of Long class).

*/

class AQ28
{
    public static void main(String args[])
    {
        Double D = 999999.99999D;
        String str = Double.toString(D);
        System.out.println("Double to string= "+str);


        Double D1 = new Double(D);
        System.out.println("Double value into double instance= "+D1);

        Double D2 = new Double(str);
        System.out.println("String value into duble instance= "+D2);

         String str1 = Double.toHexString(D);
         System.out.println(str1);

         long l1 = Double.doubleToLongBits(D); 
         System.out.println(l1);

    }
}