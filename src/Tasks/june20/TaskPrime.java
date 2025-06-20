package Tasks.june20;

import java.util.Scanner;

public class TaskPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();


        if(number<=1){
            System.out.println("false");
        }

        TaskPrime p = new TaskPrime();
        System.out.println(p.isPrime(number));


    }

    public boolean isPrime(int n){

        for (int i=2;i<=Math.sqrt(n); i++){

            if (n%i==0)
                return false;

        }
        return true;
    }
}


