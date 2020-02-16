package payroll.system;

/**
 *
 * @author Bavi
 */
public class SalariedEmployee extends Employee {
    private String contractType; // Full-time or part-time
    private int annualSalary;
    
    //Constructors
    public SalariedEmployee(String contractType, int annualSalary, String title,
            String firstName, String lastName, String dob, int niNo, int id,
            String jobTitle, String jobDepartment) {
        super(title, firstName, lastName, dob, niNo, id, jobTitle, jobDepartment);
        this.contractType = contractType;
        this.annualSalary = annualSalary;
    }
    
    
    
    //Getters and setters
    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    
}
