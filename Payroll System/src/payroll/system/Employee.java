package payroll.system;

/**
 * 
 * @author Bavi
 */
   public class Employee {
       private String title;
       private String firstName;
       private String lastName;
       private String dateOfBirth; // Date of birth
       private String nationalInsuranceNumber; // National insurance number
       private int employeeId; // Employee ID
       private String jobTitle;
       private String jobDepartment;
       
    //Constructors
       
    //Full Constructor
    public Employee(String title, String firstName, String lastName, String dob,
            String niNo, int id, String jobTitle, String jobDepartment) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dob;
        this.nationalInsuranceNumber = niNo;
        this.employeeId = id;
        this.jobTitle = jobTitle;
        this.jobDepartment = jobDepartment;
    }  
    
    //Methods
    
      
    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDepartment() {
        return jobDepartment;
    }

    public void setJobDepartment(String jobDepartment) {
        this.jobDepartment = jobDepartment;
    }
       
       
}
