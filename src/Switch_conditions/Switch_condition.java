package Switch_conditions;

import java.util.Scanner;

public class Switch_condition {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        if(scanner.hasNextInt()) {
            int Day = scanner.nextInt();
            switch (Day) {
                case 1:
                    System.out.println("Its mon");
                    break;
                case 2:
                    System.out.println("Its Tues");
                    break;
                case 3:
                    System.out.println("Its wed");
                    break;

                case 4:
                    System.out.println("Its thurs");
                    break;

                case 5:
                    System.out.println("Its Fri");
                    break;

                case 6:
                    System.out.println("Its Sat");
                    break;

                case 7:
                    System.out.println("Its Sun");
                    break;

                default:
                    System.out.println("Enter the number in between the range of 1-7");
            }
        }
        else
        {
            System.out.println("enter the value only in Interger format");
        }


    }
}
