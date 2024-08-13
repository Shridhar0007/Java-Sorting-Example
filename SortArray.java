import java.util.Arrays;
import java.util.Collections;

public class SortArray {

    public static void main(String[] args) {
        // Define an array of integers
        Integer[] numbers = {4, 2, 9, 1, 5, 6};

        // Sort array in ascending order
        Arrays.sort(numbers);
        System.out.println("Array in Ascending Order: " + Arrays.toString(numbers));

        // Sort array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Array in Descending Order: " + Arrays.toString(numbers));
    }
}