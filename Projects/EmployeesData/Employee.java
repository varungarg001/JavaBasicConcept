package Projects.EmployeesData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class EmployeeData {
    private int EmpID;
    private String EmpName;
    private String JoiningDate;
    private String DesignationCode;
    private String Department;
    private int basic;
    private int HRA;
    private int Tax;

    public EmployeeData(int EmpID, String EmpName, String JoiningDate, String DesignationCode, String Department,
            int basic, int HRA, int Tax) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.JoiningDate = JoiningDate;
        this.Department = Department;
        this.DesignationCode = DesignationCode;
        this.basic = basic;
        this.HRA = HRA;
        this.Tax = Tax;
    }

    public int getEmpID() {
        return EmpID;
    }

    public String getName() {
        return EmpName;
    } 
 
    public String getJoiningDate() {
        return JoiningDate;
    }

    public String getDesignationCode() {
        return DesignationCode;
    }

    public String getDepartment() {
        return Department;
    }

    public int getBasic() {
        return basic;
    }

    public int getHRA() {
        return HRA;
    }

    public int getTax() {
        return Tax;
    }

    public static String getDesignation(String DesignationCode) {
        String result = "";

        result = switch (DesignationCode) {
            case "e" -> "Engineer";
            case "c" -> "Consultant";
            case "k" -> "Clerk";
            case "r" -> "Receptionist";
            case "m" -> "Manager";
            default -> "Unknown";
        };
        return result;

    }

    public static int getDA(String DesignationCode) {
        int DA;
        DA = switch(DesignationCode){
            case "e"->20000;
            case "c"->32000;
            case "k"->12000;
            case "r"->15000;
            case "m"->40000;
            default->0;
        };
        return DA;
    }

    public int getSalary() {
        return basic + HRA + getDA(DesignationCode) - Tax;
    }
    
    public String toCSV() {
        return EmpID + "," + EmpName + "," + JoiningDate + "," + DesignationCode + "," + Department + "," + basic 
                + "," + HRA + "," + Tax;
    }

    public static EmployeeData FromCSV(String line){
        String[] data = line.split(",");
        return new EmployeeData(Integer.parseInt(data[0]),data[1],data[2],data[3],data[4],Integer.parseInt(data[5]),Integer.parseInt(data[6]),Integer.parseInt(data[7]));
    }

}

public class Employee {

    public static void main(String[] args) {
        ArrayList<EmployeeData> employees = loadFromFile();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter 1 For new Employees Entry");
            System.out.println("Enter 2 for get the details of the employee");
            System.out.println("Enter 3 for exit");
            choice = scanner.nextInt();
            if (choice > 3 || choice < 1) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter the new Employee Data...");
                    System.out.print("Enter the employee id: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter the first name of the employee: ");
                    String firstName = scanner.next();

                    System.out.print("Enter the last name of the employee: ");
                    String lastName = scanner.next();

                    String name = firstName + " " + lastName;

                    System.out.print("Enter the joining date of the employee: format(DD/MM/YY)");
                    String joininDate = scanner.next();

                    System.out.print("Enter the Designation code of the employee: ");
                    String DesignationCode = scanner.next();

                    System.out.print("Enter the Department of the Employee: ");
                    String Department = scanner.next();

                    System.out.print("Enter the basic salary of the employee: ");
                    int basic = scanner.nextInt();

                    System.out.print("Enter the HRA alloted to the employee: ");
                    int HRA = scanner.nextInt();

                    System.out.print("Enter the total tax on the employee: ");
                    int tax = scanner.nextInt();

                    EmployeeData employeeData = new EmployeeData(id, name, joininDate, DesignationCode, Department,
                            basic, HRA, tax);

                            
                    employees.add(employeeData);
                    saveToFile(employees);
                    break;

                case 2:
                    System.out.print("Enter the id of the employee: ");
                    int empID = scanner.nextInt();
                    System.out.print("EmpID" + "  ");
                    System.out.print("Emp Name" + "  ");
                    System.out.print("Department  ");
                    System.out.print("Designation  ");
                    System.out.println("Salary  ");

                    for (EmployeeData employee : employees) {
                        if (employee.getEmpID() == empID) {
                            System.out.println("----------------------------------------------------");
                            System.out.print(employee.getEmpID() + "  ");
                            System.out.print(employee.getName() + "  ");
                            System.out.print(employee.getDepartment()+"  ");
                            System.out.print(EmployeeData.getDesignation(employee.getDesignationCode()) + "  ");
                            System.out.println(employee.getSalary());
                            System.out.println("----------------------------------------------------");
                        }
                    }
            }
        } while (choice != 3);

        System.out.println("Exit from the loop");
        
        scanner.close();
    }
    
    public static void saveToFile(ArrayList<EmployeeData> employees) {
        try (PrintWriter pr = new PrintWriter(new FileWriter("EmployeeData.txt"))) {
            for (EmployeeData employee : employees) {
                pr.println(employee.toCSV());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       
    public static ArrayList<EmployeeData> loadFromFile(){
        ArrayList<EmployeeData> EmployeesData = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("EmployeeData.txt"))) {
            String line = br.readLine();
            while (line != null) {
                EmployeesData.add(EmployeeData.FromCSV(line));
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return EmployeesData;
    }
    
}