package Loops;

import java.util.Scanner;

public class For_Loop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");

        String Name= scanner.next();

        for(int i=Name.length()-1;i>=0;i--)
        {
            System.out.print(Name.charAt(i));
        }

    }
}
