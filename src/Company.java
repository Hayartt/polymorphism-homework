import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Haya on 23/04/2017.
 */
public class Company {
    private String name;
    private ArrayList<Employee> employeeList;
    private Scanner sc = new Scanner(System.in);
    private int totalAnnualSalary;
    public Company(){
        this("...", new ArrayList<Employee>());
    }

    public Company(String name, ArrayList<Employee> employeeList){
        this.name = name;
        this.employeeList = employeeList;
    }

    public void setName(String name){
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void addEmployee(String name, String departmentName, double salary){
        employeeList.add(new Employee(name, departmentName, salary));
    }

    public void displayAnnualSalary(){
        for(Employee e: employeeList){
            System.out.println("Name: " + e.getName()
                    + "\nSalary: " + e.getSalary()
                    + "\nDepartment name: " + e.getDepartmentName());
            totalAnnualSalary += e.getSalary();
        }
        System.out.println("Total annual salary: " + totalAnnualSalary);
    }


}
