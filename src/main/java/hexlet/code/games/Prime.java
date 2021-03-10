package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {

    public static void play() {
        System.out.println("Answer 'yes' if given number is prime."
                         + " Otherwise answer 'no'.");
        String result = "no";
        while (true) {
            int simplyNum = Engine.randomInt();
            int driver = 2;
            while (driver < simplyNum) {
                if (simplyNum % driver == 0) {
                    result = "yes";
                }
                driver += 1;
            }
            Engine.playCycle(String.valueOf(simplyNum), result);
        }
    }
}
