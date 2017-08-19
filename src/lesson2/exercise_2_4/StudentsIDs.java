/* HashMap:
Make a program similar to GradebookHashMap, but which takes
in students names and ID numbers (as integers) instead of
names and grades. In this case, however, the keys should
be integers (the IDs) and the values should be strings
(the names). Modify the roster printing code accordingly.
*/
package lesson2.exercise_2_4;

import java.util.HashMap;
import java.util.Scanner;


public class StudentsIDs {
    public static void main(String[] args) {
        HashMap<Integer, Integer> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newID;
        Integer grade;

        // declare HashMap
        // create a loop
        do {
            System.out.println("New student's ID");
            newID = in.nextInt();

            if (!newID.equals(0)) {
                System.out.print("Grade for " + newID + ": ");
                grade = in.nextInt();
                students.put(newID, grade);
                System.out.println(grade + " " + newID);
                // Read in the newline before looping back
                in.nextInt();
            }

        } while (!newID.equals("\n"));
    }
}

// TODO: how do I stop integer loop ?