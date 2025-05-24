package Java_Operators;

import java.lang.foreign.ValueLayout;

public class Task_TO {
    public static void main(String[] args) {
         //Checking the number if it is even or odd

        int a=2;
        String val= a%2==0 ?"Number is even": "Number is Odd";

        System.out.println(val);

        //checking the max number using Nested terenary operator out of 3

        int x=20;
        int y=29;
        int z=38;

        String Value=(x>y)?(x>z)?"X is the largest":"Z is the largest": ((y>z)?"Y is the largest":"Z is the largest");

        System.out.println(Value);

        //Checking the person if he is a minor, major, senior using Nested Ternary operator

        int Age=17;

        String personIs =Age>18?(Age>45?"Senior":"Major"):"Minor";

        System.out.println(personIs);




    }
}
