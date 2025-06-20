package Java_Methods;

public class Static_variables {

    public static void main(String[] args) {

        Example e1= new Example();
        Example e2= new Example();
        Example e3= new Example();

        System.out.println(Example.count);

    }
}

class Example
{
    public static int count=0;
     public Example(){
         count++;
     }

}

