/*
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.

*/

class A_Q6
{    

    public static void main(String [] args)
    {

        // boolean to string

        boolean num1 = true;
        boolean num2 = false;
        String s1= Boolean.toString(num1);
        String s2= Boolean.toString(num2);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println();

        //string to boolean

        String s3 = "CDAC";
        String s4 = "Mumbai";
        boolean B1 = Boolean.parseBoolean(s3);
        boolean B2 = Boolean.parseBoolean(s4);
        System.out.println(B1);
        System.out.println(B2);

        System.out.println();


        //boolean value into boolean instance

        boolean b1 = true;
        System.out.println("boolean value into boolean instance");
        Boolean B = Boolean.valueOf(b1); // boolean value into boolean instance

        
        //String value into Boolean instance
        String str2="Omkar";
        System.out.println("_______________________");
        System.out.println("String value into Boolean instance");
        Boolean Bl =Boolean.valueOf(str2); //String value into Boolean instance
        System.out.println(Bl);







































    }
}



