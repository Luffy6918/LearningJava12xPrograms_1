package Conditional_Loops;

import java.util.Scanner;

public class Hacker_rank_usingIf_with_Scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of the sides");
        int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        int n3= scanner.nextInt();

        if (n1==n2)
        {
            if(n2==n3)
            {
                System.out.println("It's an Equilateral Triange");
            }
            else
            {
                System.out.println("It's an Isosceles Triange");
            }

        }
        else
        {
            System.out.println("It's a Scalen triange");
        }

    }
}
