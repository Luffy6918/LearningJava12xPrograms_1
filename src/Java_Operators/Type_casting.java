package Java_Operators;

public class Type_casting {
    public static void main(String[] args) {
        int a=300;
        byte b= (byte)a;
        System.out.println(b);


        int bill=100;
        float GST=18.5f;
        int total= bill+(int)GST;
        System.out.println(total);

        float total1= bill+GST;
        System.out.println(total1);


    }
}
