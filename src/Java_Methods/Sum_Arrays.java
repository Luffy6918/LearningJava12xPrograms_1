package Java_Methods;

import java.util.Scanner;

public class Sum_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String[] marks = new String[size];
        for(int i=0; i<marks.length; i++)
        {
            System.out.println("Enter the elements"+ i);

            marks[i] =scanner.next();

        }
        for(int i=0; i<=marks.length; i++){
            System.out.println(i);
        }
       scanner.close();

    }
}
