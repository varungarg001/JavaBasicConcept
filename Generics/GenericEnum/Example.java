package Generics.GenericEnum;

enum Months {
    Janurary, februrary, March, April, May, June, July, August, September, October, November, December;


}

public class Example {

    public static void main(String[] args) {
        System.out.println(Months.Janurary);

        for (Months month : Months.values()) {
            System.out.println(month);
        }
    }
}