package Conditional_Loops;

public class Hacker_rank_usingIf {

    public static void main(String[] args) {
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        int n3=Integer.parseInt(args[2]);

        if (n1==n2)
        {
            if(n2==n3)
            {
                System.out.println("It's an Equilateral Triange");
            }
            else
            {
                System.out.println("It's an Isosceles Triange");
            }

        }
        else
        {
            System.out.println("It's a Scalen triange");
        }


    }
}
