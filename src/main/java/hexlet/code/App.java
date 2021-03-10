package hexlet.code;
import hexlet.code.games.Even;
import java.util.Scanner;
/**
 * Welcome to the Brain Games!
 *
 */
public class App {

    public static void main(final String[] args) {
        makeGame();
    }

    public static void makeGame() {
        System.out.println("Please enter the game number and press Enter.\n"
        +  "1 - Greet\n"
        + "2 - Even\n"
        + "0 - Exit\n");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String choice =  sc.nextLine();
        Cli.hello();
        switch (choice) {
            case "1":
                break;
            case "2":
                Even.play();
                break;
            default:
                break;
        }

    }
}
