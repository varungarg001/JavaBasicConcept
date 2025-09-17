package ExceptionHandling;

//class Emp {
//    int id;
//    String name;
//
//    @Override
//    public String toString() {
//        return  "hello this is the emp class";
//    }
//}

public class fileo1 {
    public static void main(String[] args) {

//        Emp emp =new Emp();
//        System.out.println("this is me employee "+emp);
        int [] numerators = {10,20,400,40};
        int [] denominators = {10,2,0,4};

        for(int i=0;i<numerators.length;i++){
            System.out.println(divide(numerators[i],denominators[i]));
        }
        System.out.println("good bye");
    }

    public static int divide(int a , int b){
        try{
            return a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }

    }
}
