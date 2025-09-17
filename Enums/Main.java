package Enums;

enum Day {
    Sunday("Sunday"),
    Monday("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thursday("Thursday"),
    Friday("Friday"),
    Saturday("Saturday");

    private String lower;

    private Day(String lower) {
        System.out.println("constructor");
        this.lower = lower;
    }
    
    public String getLower() {
        return lower.toLowerCase();
    }



    public void display() {
        System.out.println("Today is: "+this.name());
    }
}

public class Main {
    public static void main(String[] args) {
        // System.out.println(Day.Friday);
        Day monday = Day.Monday;
        System.out.println(monday); // name method is use to acess the method of String 
        
        Day.valueOf("Monday"); // if the given string not match with the values present in the enums then it will throw the error 

        monday.display();

        for (Day day : Day.values()) {
            System.out.println(day);
        }

        System.out.println(monday.getLower());
        
        

    }
}