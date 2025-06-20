package Tasks;

import java.util.Scanner;

public class Task_char_Alphabet {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enetr the char value");

        char value=scanner.next().charAt(0);

        if(((value >= 'A') && (value <= 'Z')) || (((value >= 'a') && value <='z')))
        {
            System.out.println(value +" is a Alphabet");

        }

        else{
            System.out.println("not an Alphabet");

        }




    }
}
