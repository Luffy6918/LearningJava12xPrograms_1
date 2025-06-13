package Java_Methods;

import java.util.Scanner;

public class Calculator_methods {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int a =readInt("Enter the number1",scanner);
        int b = readInt("Enter the number2",scanner);
        int result_sum= sum(a,b);
        int result_difference=difference(a,b);
        int result_div=div(a,b);
        int result_mul=mult(a,b);

        System.out.println(result_sum);
        System.out.println(result_difference);
        System.out.println(result_div);
        System.out.println(result_mul);




    }

    public static int readInt(String prompt, Scanner scanner)
    {
        System.out.println(prompt);
        if(scanner.hasNextInt()){
            return scanner.nextInt();




        }
        else{
            System.out.println("Enter the number only");

            System.exit(0);
            return -1;

        }



    }
    public static int sum(int a, int b){

        return (a+b);


    }
    public static int difference(int a , int b){

        return (a-b);


    }
    public static int div(int a , int b){

        if (b==0){
            throw new ArithmeticException("Division by zero is not possible");
        }
        return (a/b);


    }
    public static int mult(int a , int b){

        return (a*b);


    }


}
