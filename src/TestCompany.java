/**
 * Created by Haya on 01/05/2017.
 */
public class TestCompany {

    public static void main(String[] args){
        // 1
        Employee employee = new Employee("Haya", "System Adminstration", 31415);
        Manager manager = new Manager("Haya", "System Adminstration", 41348);
        Executive executive = new Executive("Haya", "IT", 84314);

        printSalary(employee);
        printSalary(manager);
        printSalary(executive);

        System.out.println();

        // 2
        Company company = new Company();
        company.setName("Toe-wific");
        System.out.println(company.getName());
        company.addEmployee(employee);
        company.addEmployee(manager);
        company.addEmployee(executive);
        company.displayAnnualSalary();





    }

    private static void printSalary(Employee e){
        System.out.println(e.getName() + ": " + e.getSalary());
    }

}
