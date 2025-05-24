package Java_Operators;

public class increment_decrement_task {

    public static void main(String[] args) {
        int i =11;
        i=i++ + ++i;

        System.out.println(i);

        int a=11, b=22 ,c;
        c= a+b+a++ +b++ + ++a + ++b;// 11+22+11+23+12+24=103
        System.out.println(a);//13
        System.out.println(b);//24
        System.out.println(c);//103

        int x=1,j=2,k=3;
        int m=x-- -j-- -k--;//1-2-3=-4
        //x--expA
        System.out.println(x+j+k+m);//0+1-2=-1



    }
}
