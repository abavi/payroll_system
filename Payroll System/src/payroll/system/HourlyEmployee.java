package payroll.system;

import java.util.ArrayList;

/**
 *
 * @author Bavi
 */
public class HourlyEmployee extends Employee {
    private double hourlyRate;
    
    //Constructors
    public HourlyEmployee(double hourlyRate, String title, String firstName,
            String lastName, String dob, String niNo, int id, String jobTitle,
            String jobDepartment) {
        super(title, firstName, lastName, dob, niNo, id, jobTitle, jobDepartment);
        this.hourlyRate = hourlyRate;
    }
    
    public static void printList(ArrayList<HourlyEmployee> hourlyEmployee){
        for(HourlyEmployee employee : hourlyEmployee){
            System.out.println(employee.hourlyRate + " " + employee.getTitle() + " " +
                    employee.getFirstName() + " " + employee.getLastName() + " " + employee.getDateOfBirth() + " " +
                    employee.getNationalInsuranceNumber() + " " + employee.getEmployeeId() + " " +
                    employee.getJobTitle() + " " + employee.getJobDepartment());
        }
    }
    
    //Getters and setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
}
