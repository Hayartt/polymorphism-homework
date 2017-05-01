/**
 * Created by Haya on 23/04/2017.
 */
public class Employee {
    private String name;
    private String departmentName;
    private double salary;
    private int id;
    private static int numberOfEmployees;


    public Employee(){
        this("", "", 0.0);
    }

    public Employee(String name, String departmentName, double salary) {
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
        id = ++numberOfEmployees;
    }

    protected void printConfidentialRecord(){
        System.out.println("Name: " + name + "\n" +
                "Department name: " + departmentName +
                "\nSalary: " + salary);
    }

    protected void setSalary(double salary) {
        this.salary *= salary;
    }

    protected void setSalary(int salary) {
        this.salary += salary;
    }

    protected double getSalary() {
        return salary;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getDepartmentName() {
        return departmentName;
    }

    protected void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    protected int getID() {
        return id;
    }
}
