/*
a. The number of bits used to represent a char value
b. The number of bytes used to represent a char value
c. The minimum value a char
d. The maximum value a char
*/

class A_Q10
{
    public static void main(String args[])
    {
        
       System.out.println("bits used to represent a char value = "+Character.SIZE);
       System.out.println("number of bytes used to represent a char value = "+Character.BYTES);
       char ch1 = Character.MIN_VALUE;
       System.out.println("The minimum value a char = "+ch1);
       System.out.println("The maximum value a char = "+Character.MAX_VALUE);
    
    }
}