/* Input/output:
Modify your "Hello, World" program to prompt the user for their name, and greet them by name.
*/
package lesson1;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in;
        String name;

        in = new Scanner(System.in);
        System.out.println("What is your name?");
        name = in.nextLine();

        System.out.println("Nice to meet you " + name);
    }
}
