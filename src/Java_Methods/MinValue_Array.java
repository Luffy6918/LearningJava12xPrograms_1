package Java_Methods;

public class MinValue_Array {
    public static void main(String[] args) {
            int[] marks={34,24,28,44,77,45,56,69,79,99};

            int Minimum_value =min_value_Array(marks);
            System.out.println("Max value in the array is"+  Minimum_value);

        }

        static int min_value_Array(int[] marks){

            int min_value=marks[0];
            for (int i=0; i<marks.length;i++){
                if(marks[i]<min_value){
                    min_value=marks[i];
                }
            }
            return min_value;
        }
    }

