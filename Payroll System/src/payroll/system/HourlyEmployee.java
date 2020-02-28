package payroll.system;

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
    
    //Getters and setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
}
