package payroll.system;

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
