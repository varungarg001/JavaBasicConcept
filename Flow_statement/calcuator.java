package Flow_statement;

import java.util.Scanner;

class calcuator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Value: ");
        String input1 = sc.next();

        System.out.println("Enter the operator: ");
        System.out.println("Options are: " + " + , * , - , / , % , concat ");

        String operator = sc.next();

        System.out.println("Enter the second Value: ");
        String input2 = sc.next();

        Object result;

        result = switch (operator) {
            case "+" -> change(input1) + change(input2);

            case "-" -> change(input1) - change(input2);

            case "*" -> change(input1) * change(input2);

            case "/" -> change(input1) / change(input2);

            case "%" -> change(input1) % change(input2);

            case "concat" -> input1 + input2;

            default -> "Invalid input";
        };

        System.out.println("Result: "+result);

    }

    static double change(String s) {
        return Double.parseDouble(s);
    }
    
}