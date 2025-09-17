// class test {
//     public void m1(Integer m1) {
//         System.out.println("Integer value: "+m1);
//     }
//     public void m1(Long m1) {
//         System.out.println("Long value: "+m1);
//     }
//     public void m1(Double m1) {
//         System.out.println("Double value: "+m1);
//     }
// }

public class hello {

    static void func(int i) {
        System.out.println("int");
    }

    static void func(Integer i) {
        System.out.println("Integer");
    }
    public static void main(String[] args) {
        // long l = 100l;
        // test t1 = new test();
        // t1.m1(l);

        // Double d = 10.456;
        // t1.m1(d);

        byte b =10;
        hello.func(b);

        Integer i = 10;
        int i1 = 10;
        System.out.println(i==i1);


   } 
}
