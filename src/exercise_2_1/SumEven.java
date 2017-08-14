package exercise_2_1;
import java.util.ArrayList;

public class SumEven {
    public static int sumEvenInList(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }
        return sum;
    }
}
