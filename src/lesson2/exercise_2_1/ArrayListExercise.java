/*ArrayList:
* Write a static method to find the sum of all the even numbers in a list.
* Within main, create a list with at least 10 integers and call your
* method on the list.
*/

package lesson2.exercise_2_1;
import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> randomNums = new ArrayList<>();
        randomNums.add(5);
        randomNums.add(66);
        randomNums.add(346);
        randomNums.add(765);
        randomNums.add(989);
        randomNums.add(321);
        randomNums.add(54);
        randomNums.add(56);
        randomNums.add(43);
        randomNums.add(897);
        randomNums.add(990);
        randomNums.add(23);


        System.out.print(SumEven.sumEvenInList(randomNums));
    }
}
