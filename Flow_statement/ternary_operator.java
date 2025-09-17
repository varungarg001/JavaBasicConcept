package Flow_statement;

public class ternary_operator {
    public static void main(String[] args) {
        // write a program to check given number is odd or even

        // by using if else statement

        int n = 9;



        // if(n%2==0) 
        //     System.out.println("Even numver");
        // else
        //  System.out.println("Odd number");   // this is how we use if and else statement so to do that easily we can use ternary

        String result = n % 2 == 0 ? "number is even " : "number is odd " ; // ternary operator   condition? true vlaue: false value

       System.out.println(result);
          
    }
}
