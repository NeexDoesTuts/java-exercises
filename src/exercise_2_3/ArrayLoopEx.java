/*Arrays:
Create and initialize an array with the following values
in a single line: 1, 1, 2, 3, 5, 8. Then loop through
the array and print out each value.
*/


package exercise_2_3;

import java.lang.reflect.Array;

public class ArrayLoopEx {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 1, 2, 3, 5, 8};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
