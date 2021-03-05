package hexlet.code;
import java.util.Scanner;
/**
 * Welcome to the Brain Games!
 *
 */
public class App {

    public static void main(final String[] args) {
        makeGame();
        Cli.hello();
    }

    public static void makeGame() {
        System.out.println("Please enter the game number and press Enter.\n"
        +  "1 - Greet\n"
        + "0 - Exit\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Your choice: " + sc.nextInt());
    }
}
