/*

.Write a program to perform below operations on float type to
get:
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float
*/

class AQ23
{
    public static void main(String args[])
    {
 
      
       System.out.println("bits used to represent a float value = "+Float.BYTES);
       System.out.println("number of bytes used to represent a float value = "+Float.BYTES);
       System.out.println("The minimum value a float = "+Float.MIN_VALUE);
       System.out.println("The maximum value a float = "+Float.MAX_VALUE);


    }
}