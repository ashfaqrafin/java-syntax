
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 1;
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // sorting
        Arrays.sort(numbers);
        int[] marks= {1, 2, 3, 4, 5};
        int[][] finalMarks = {{1, 2, 3}, {4, 5, 6}};

    }
    
}
