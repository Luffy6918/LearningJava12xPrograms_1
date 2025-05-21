package Java_Operators;

public class NesterTerenaryOperator {
    public static void main(String[] args) {


        int age = 27;
        String GoaPlan = age > 19 ? (age > 25 ? ("In Goa You can Drink") : "You can't drink") : "You can't got to Goa";

        System.out.println(GoaPlan);

    }
}
