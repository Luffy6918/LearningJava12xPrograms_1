package Java_Operators;

public class Increment_decrement {

    public static void main(String[] args) {

        int num=10;
        int a=num++;
        int b=++num;

        System.out.println(num);
        System.out.println(a);
        System.out.println(b);

        int x=10;
        System.out.println(++x + x++);


        System.out.println(x);

        int y =11;
        int m=y--;
        System.out.println(m);
        System.out.println(y);
        System.out.println(--y + ++y);
        System.out.println(y);



    }
}
