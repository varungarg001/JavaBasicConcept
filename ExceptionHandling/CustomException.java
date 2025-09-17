package ExceptionHandling;


public class CustomException extends Exception{
    @Override
    public String toString(){
        return "you don't have enough money";
    }

    public CustomException(){
        super("what do you want ? you don't have money ");
    }


}
