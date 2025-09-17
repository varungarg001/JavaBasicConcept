package Arrays;


class student{
    int roll_no;
    String name;
    int marks;

}

public class arrayOfObject {

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Varun";
        s1.roll_no = 60;
        s1.marks = 45;

        student s2 = new student();
        s2.name = "nishchal";
        s2.roll_no = 40;
        s2.marks = 85;

        student s3 = new student();
        s3.name = "sandy";
        s3.roll_no = 50;
        s3.marks = 75;

        student arr[] = new student[3];  // array of objects

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        // System.out.println(arr[0].name);

        for (student i : arr) {
            if (i.name == "Varun") {
                System.out.println("Name: "+i.name);
                System.out.println("Roll No: "+i.roll_no);
                System.out.println("Marks: "+i.marks);
                break;
            }
            else {
                System.out.println("Not Found");
            }
        }

        
    }
}