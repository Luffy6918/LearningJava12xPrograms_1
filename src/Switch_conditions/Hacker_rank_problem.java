package Switch_conditions;

import java.util.Scanner;

public class Hacker_rank_problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");

        long year = scanner.nextLong();


        System.out.println("Enter the number");

        int Month = scanner.nextInt();

        switch (Month) {
            case 1, 3, 5, 7, 9, 11:
                System.out.println("No of days in the entered number are 31");
                break;

            case 4, 6, 8, 10, 12:
                System.out.println("No of days in the entered number are 30");
                break;

            case 2:
                if (((year % 100 == 0) && (year % 400 == 0)) || (year % 100 == 0)) {
                    System.out.println("number of days in Feb is 29");
                } else {
                    System.out.println("number of days in Feb is 28");
                }
                break;

            default:
                System.out.println("enter the  number from 1-12");
        }

    }



    }

