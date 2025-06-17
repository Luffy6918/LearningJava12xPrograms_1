package Java_Methods;

public class Maximum_number_Array {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
        public static void main(String[] args) {

            int[] marks={34,24,28,44,77,45,56,69,79,99};

            int Maximum_value =max_value_Array(marks);
            System.out.println("Max value in the array is"+  Maximum_value);

        }

        static int max_value_Array(int[] marks){

            int max_value=marks[0];
            for (int i=0; i<marks.length;i++){
                if(marks[i]>max_value){
                    max_value=marks[i];
                }
            }
            return max_value;
        }
    }

