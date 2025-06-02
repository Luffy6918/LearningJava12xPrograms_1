package Switch_conditions;

import java.util.Scanner;

public class Excersises_Switch_If_calculator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1");
        int number =scanner.nextInt();
        System.out.println("Enter the number2");
        int number2 =scanner.nextInt();
        System.out.println("Enter the operation you want to perform");

        char math=scanner.next().charAt(0);
        double result;
        switch(math)
        {
            case '+':
                result=number+number2;
                System.out.println(result);
                break;
            case '-':
                result=number-number2;
                System.out.println(result);
                break;
            case '*':
                result=number*number2;
                System.out.println(result);
                break;
            case'/':
            {
                if ((number2 != 0)) {
                    result = number / number2;
                    System.out.println(result);

                }
                else{
                    System.out.println("division by zero is not allowed");
                }
            }


            default:
                System.out.println("Invalid operator");
        }

    }

}
