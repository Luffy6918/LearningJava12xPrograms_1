package Java_Methods;

public class Arrays {
    public static void main(String[] args) {

        int [] a={40,20,46,34,48,77,99};
        int max_value =maximum_number(a);
        System.out.println(max_value);

    }

    public static int maximum_number(int[] a)
    {
        int max=a[0];
     for (int i=0; i<a.length; i++){

         if(a[i]>max)
         {
           max=a[i];
         }

     }
     return max;

    }
}
