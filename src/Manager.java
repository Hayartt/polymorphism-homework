import java.util.ArrayList;

/**
 * Created by Haya on 23/04/2017.
 */
public class Manager extends Employee {
    private ArrayList<Employee> supervisedEmployees;

    public Manager(String name, String departmentName, double salary){
        super(name, departmentName, salary);
    }

     @Override
    protected void printConfidentialRecord(){
         super.printConfidentialRecord();
         System.out.println("Supervised employees ID numbers:");
         for (Employee employee: supervisedEmployees){
             System.out.println(employee.getID());
         }
     }

}
