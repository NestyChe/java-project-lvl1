package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {

    public static void play() {
        System.out.println("What is the result of the expression?");
        int result = 1;
        String str = "+-*-*+--*+*+-";
        while (true) {
        int firstOperand = Engine.randomInt();
        int secondOperand = Engine.randomInt();
        char operator;
        operator = str.charAt(1 + (int) (Math.random() * str.length() - 1));
        String halfExpresion = "" + firstOperand + " " + operator;
        String expression = " " + halfExpresion + " " + secondOperand;
        switch (operator) {
        case '-':
             result = firstOperand - secondOperand;
             break;
        case '+':
             result = firstOperand + secondOperand;
             break;
        case '*':
             result = firstOperand * secondOperand;
             break;
        default:
             break;
        }
        Engine.playCycle(expression.trim(), String.valueOf(result));
        }
    }
}
