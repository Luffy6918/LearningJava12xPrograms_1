package Java_Methods;

public class task_Method {
    public static void main(String[] args) {

        System.out.println(readInt());


    }

    public static int readInt(){

        for (int i=1; i<=100; i++)
        {
            if (i%3==0){
                System.out.println("Fizz");

            } else if (i%5==0) {
                System.out.println("Buzz");

            }
            if((i%3==0)&&(i%5==0)) {
                System.out.println("FizzBuzz");

            }
        }
        return 0;
    }

}
