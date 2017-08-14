package exercise_2_2;
import java.util.ArrayList;

public class StaticFive {
    public static void main(String[] args) {
        // create ArrayList to hold random words
        ArrayList<String> words = new ArrayList<>();
        words.add("This is a string");
        words.add("five1");
        words.add("hello");
        words.add("");
        words.add(" minus ");
        words.add("     ");
        words.add("you 2");
        words.add("oregon");
        words.add("This is not a test");
        words.add("we are gooders");
        // test words in the ArrayList and print to console
        printFive(words);
    }

    public static void printFive(ArrayList<String> listOfWords) {
        int total = 0;
        for (int i = 0; i < listOfWords.size(); i++) {
            if (listOfWords.get(i).length() == 5) {
                System.out.println(listOfWords.get(i));
                total++;
            }
        }
        System.out.println("The total number of 5-letter words is " + total);
    }
}



/*
for (int i = 0; i < students.size(); i++) {
        System.out.println(students.get(i) + " (" + grades.get(i) + ")");
        sum += grades.get(i);
        }

*/