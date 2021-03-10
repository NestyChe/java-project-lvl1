package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
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
        + "1 - Greet\n"
        + "2 - Even\n"
        + "3 - Calc\n"
        + "4 - GCD\n"
        + "5 - Progression\n"
        + "6 - Prime\n"
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
            case "3":
                Calc.play();
                break;
            case "4":
                GCD.play();
                break;
            case "5":
                Progression.play();
                break;
            case "6":
                Prime.play();
                break;
            case "0":
                System.exit(0);
                break;
            default:
                break;
        }

    }
}
