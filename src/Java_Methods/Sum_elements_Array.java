package Java_Methods;

public class Sum_elements_Array {

    public static void main(String[] args) {
        int[] Marks ={54,56,44,55,55,66};

        int Marks_Sum=Sum_Marks(Marks);
        System.out.println(Marks_Sum);

    }

    static int Sum_Marks (int[] Marks){

        int Sum=0;
        for(int i=0; i<Marks.length;i++)
        {
            Sum =Sum+Marks[i];

        }

        return Sum;
    }
}
