package Java_Methods;

import java.util.Scanner;

public class TakingUserInput_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size= scanner.nextInt();
        int[] Marks=new int[size];

        for(int i=0;i<Marks.length;i++)
        {
            System.out.println("Enter the marks");
            Marks[i]=scanner.nextInt();
        }

        System.out.println("___________________");

        for(int i=0;i<Marks.length;i++){
            System.out.println(Marks[i]);
        }



    }
}
