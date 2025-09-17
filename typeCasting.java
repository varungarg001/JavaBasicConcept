public class typeCasting {
    public static void main(String[] args) {

        float f = 5.6f;
        int x = (int) f;

        System.out.println(x);

        int y = 1000;
        byte num = (byte) y;

        System.out.println(num);

        byte a = 10;
        byte b = 20;

        int result = a * b; //type promotion

        System.out.println(result);  
}
}
