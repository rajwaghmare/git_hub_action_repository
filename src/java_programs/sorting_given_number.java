package java_programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sorting_given_number {

    public static void main(String[] args){
        int[] numbers = {5,27,98,56,267,7,900,0};

        Arrays.sort(numbers);

        System.out.println("Sorted Number: ");

        for(int number : numbers ){
            System.out.println(number + " ");
        }
    }
}
