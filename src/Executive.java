/**
 * Created by Haya on 23/04/2017.
 */
import java.util.Scanner;
public class Executive extends Manager {
    private Scanner readInput = new Scanner(System.in);
    private double bonusPercentage = -1;
    private double profit;

    public Executive(String name, String departmentName, double salary){
        super(name, departmentName, salary);
    }


    @Override
    public double getSalary(){
        if(bonusPercentage == -1)
            return super.getSalary() + calculateBonus();
        return super.getSalary() + (profit * bonusPercentage);
    }

    private double calculateBonus(){
        System.out.println("What's the company's profit for this year?");
        profit = readInput.nextDouble();
        System.out.println("What's the bonus percentage for the executive managers?");
        bonusPercentage = readInput.nextDouble()/100;
        return profit * bonusPercentage;
    }

    protected void changeBonusPercentage(double bonusPercentage){
        this.bonusPercentage = bonusPercentage;
    }
}
