package Generics.GenericEnum;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THUREDAY, FRIDAY, SATURDAY;
}

public class test {

    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        // Day dayy = "ello";  // enum are always type safe because after the creaation of enum we cannot add others items to it.
    }
}