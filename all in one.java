import java.io.*;
class result
{
    public static void main( String[] args)
    {
        // initializing variables
        int num1 =2, num2 = 3 ,div=0 , add=0 , sub=0, mult=0;
        // Displaying num1 and num2
        System.out.println ("num1=" + num1);
        System.out.println ("num2=" + num2);
        // subtracting num1 and num2
        div = num1 / num2;
        sub = num1 - num2;
        add = num1 + num2;
        mult = num1 * num2;
        System.out.println ("division = " + div);
        System.out.println ("subtraction = " + sub);
        System.out.println ("addition = " + add);
        System.out.println ("multipication = " + mult);
    }
}