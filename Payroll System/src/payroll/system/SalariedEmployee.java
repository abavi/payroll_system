package payroll.system;

import java.util.ArrayList;

/**
 *
 * @author Bavi
 */
public class SalariedEmployee extends Employee {
    private String contractType; // Full-time or part-time
    private int annualSalary;
    
    //Constructors
    public SalariedEmployee(String contractType, int annualSalary, String title,
            String firstName, String lastName, String dob, String niNo, int id,
            String jobTitle, String jobDepartment) {
        super(title, firstName, lastName, dob, niNo, id, jobTitle, jobDepartment);
        this.contractType = contractType;
        this.annualSalary = annualSalary;
    }
    
    public static void printList(ArrayList<SalariedEmployee> salariedEmployees){
        for(SalariedEmployee employee : salariedEmployees){
            System.out.println(employee.contractType + " " + employee.annualSalary + " " + employee.getTitle() + " " +
                    employee.getFirstName() + " " + employee.getLastName() + " " + employee.getDateOfBirth() + " " +
                    employee.getNationalInsuranceNumber() + " " + employee.getEmployeeId() + " " +
                    employee.getJobTitle() + " " + employee.getJobDepartment());
        }
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
