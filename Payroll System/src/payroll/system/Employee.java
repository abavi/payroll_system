package payroll.system;

/**
 *
 * @author Bavi
 */
   public class Employee {
       private String title;
       private String firstName;
       private String lastName;
       private String dob; // Date of birth
       private int niNo; // National insurance number
       private int id; // Employee ID
       private String jobTitle;
       private String jobDepartment;
       
    //Constructors
       
    //Full Constructor
    public Employee(String title, String firstName, String lastName, String dob,
            int niNo, int id, String jobTitle, String jobDepartment) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.niNo = niNo;
        this.id = id;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getNiNo() {
        return niNo;
    }

    public void setNiNo(int niNo) {
        this.niNo = niNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
