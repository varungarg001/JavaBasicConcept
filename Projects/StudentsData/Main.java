package Projects.StudentsData;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("ID: " + id + " name: " + name + " age: " + age);
    }
    
    String tocsv() {
        return id + "," + name + "," + age;
    }
    
    public static Student fromCSV(String line) {
        String result[] = line.split(",");

        return new Student(Integer.parseInt(result[0]), result[1], Integer.parseInt(result[2]));
    }


}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = loadFile();

        int choice;

        do {
            System.out.println("----- Student Management System -----");
            System.out.println("Enter 1 for Add student ");
            System.out.println("Enter 2 for View List of student ");
            System.out.println("Enter 3 for Remove an student ");
            System.out.println("Enter 4 for Edit an student property ");
            System.out.println("Enter 5 for Exit ");
            System.out.println("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                // case 1 add new student

                case 1:
                    System.out.println("Enter Student id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter student age: ");
                    int age = sc.nextInt();

                    Student newStudent = new Student(id, name, age);

                    students.add(newStudent);
                    saveToFile(students);
                    System.out.println("Student Added Successfully");
                    break;

                case 2:
                    // viewing list of all student
                    if (students.size() == 0) {
                        System.out.println("there is no student in the system");
                        break;
                    }
                    for (Student i : students) {
                        i.display();
                    }
                    break;

                case 3:
                    // deletion of student from the system

                    if (students.size() == 0) {
                        System.out.println("there is no student in the system");
                        break;
                    }
                    System.out.println("Enter the ID of the Student: ");
                    int student_id = sc.nextInt();
                    for (Student i : students) {
                        if (i.id == student_id) {
                            students.remove(i);
                            saveToFile(students);
                            break;
                        }
                    }
                    System.out.println("ID not present");
                    break;

                case 4:
                    int updateChoice = 0;
                    System.out.println("Enter the ID of the student in which you want to make changes: ");
                    int studentId = sc.nextInt();
                    System.out.println("To update name of the student Press 1: ");
                    System.out.println("To update Age of the student Press 2: ");
                    updateChoice = sc.nextInt();

                    for (Student i : students) {
                        if ((updateChoice == 1) && (i.id == studentId)) {
                            System.out.println("Enter the new value of name: ");
                            sc.nextLine();
                            i.name = sc.nextLine();
                            saveToFile(students);
                            break;
                        } else if ((updateChoice == 2) && (i.id == studentId)) {
                            System.out.print("Enter the new value of age: ");
                            i.age = sc.nextInt();
                            saveToFile(students);
                            break;
                        }
                    }
                    System.out.println("ID is not Present");
                    break;


                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Wrong input");
                    break;

            }

        } while (choice != 5);
        sc.close();
    }
    
   public static void saveToFile(ArrayList<Student> students) {
        try (PrintWriter pr = new PrintWriter("StudentData.txt")) {
            for (Student i : students) {
                pr.println(i.tocsv());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static ArrayList<Student> loadFile() {
        ArrayList<Student> newStudent = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("StudentData.txt"))) {
            String data = br.readLine();

            while (data != null) {
                newStudent.add(Student.fromCSV(data));
                data = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return newStudent;
    }
    
}