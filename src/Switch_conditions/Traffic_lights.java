package Switch_conditions;

import java.util.Scanner;

public class Traffic_lights {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the color");
        String color = scanner.next();

        switch(color)
        {
            case "red":
                System.out.println("Stop");
                break;

            case "green":
                System.out.println("GO");
                break;

            case "orange":
                System.out.println("drive fast");
                break;
            default:
                System.out.println("Invalid color");
        }



    }
}
