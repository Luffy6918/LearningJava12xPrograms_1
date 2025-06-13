package Loops;

import java.util.Scanner;

public class Factorial_whileLoop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();

        int fact=1;
        int i=1;
        if (n==0){
            fact=1;
        }
        while(i<=n){

            fact =fact*i;

            i++;

        }
        System.out.println(fact);




    }
}
