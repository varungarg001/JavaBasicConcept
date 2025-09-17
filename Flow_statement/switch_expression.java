package Flow_statement;

public class switch_expression {
    public static void main(String[] args) {
        String input = "Saturday";

        String result = switch(input){
            case "Sunday", "Saturday" -> "6AM";
            case "Monday" -> "8AM";
            default -> "7AM";
        };

        System.out.println(result);

    }
}
