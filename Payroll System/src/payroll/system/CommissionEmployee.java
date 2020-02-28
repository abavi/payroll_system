package payroll.system;

import java.util.ArrayList;

/**
 *
 * @author Bavi
 */
public class CommissionEmployee extends Employee {
    private int annualGrossSalary;
    private double commissionRate;
    
    //Constructors
    public CommissionEmployee(int annualGrossSalary, double commissionRate,
            String title, String firstName, String lastName, String dob,
            String niNo, int id, String jobTitle, String jobDepartment) {
        super(title, firstName, lastName, dob, niNo, id, jobTitle, jobDepartment);
        this.annualGrossSalary = annualGrossSalary;
        this.commissionRate = commissionRate;
    }
    
    public static void printList(ArrayList<CommissionEmployee> commissionEmployees){
        for(CommissionEmployee employee : commissionEmployees){
            System.out.println(employee.annualGrossSalary + " " + employee.commissionRate + " " + employee.getTitle() + " " +
                    employee.getFirstName() + " " + employee.getLastName() + " " + employee.getDateOfBirth() + " " +
                    employee.getNationalInsuranceNumber() + " " + employee.getEmployeeId() + " " +
                    employee.getJobTitle() + " " + employee.getJobDepartment());
        }
    }
    
    //Getters and Setters
    public int getAnnualGrossSalary() {
        return annualGrossSalary;
    }

    public void setAnnualGrossSalary(int annualGrossSalary) {
        this.annualGrossSalary = annualGrossSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
    
}
