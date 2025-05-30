package Switch_conditions;

import java.util.Scanner;

public class Task_Swith {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade");
        String grade = scanner.next();
        String Name=grade.toUpperCase();
        switch(Name)
        {
            case "A":
                System.out.println("you are excellent");
                break;
            case "B":
                System.out.println("you are very good");
                break;
            case "C":
                System.out.println("you are good");
                break;
            case "D":
                System.out.println("you need improvement");
                break;
            case "E":
                System.out.println("you need more focus: bad");
                break;
            case "F":
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid grade");
                break;

        }




    }
}
