package payroll.system;

import java.util.ArrayList;
import java.util.Scanner;

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
           System.out.println(employee.getTitle() + " | " + employee.getFirstName() + " " + employee.getLastName() + " | " + employee.getDateOfBirth()
                     + " | " + employee.getNationalInsuranceNumber() + " | " + employee.getEmployeeId() + " | " + employee.getJobTitle()
                     + " | " + employee.getJobDepartment() + " | " + employee.hourlyRate + " | ");
        }
    }
    
    public static void enterDetails(ArrayList<HourlyEmployee> hourlyEmployee){
        //Local Variables to allow the user to create the Salaried Employee
       String title;
       String firstName;
       String lastName;
       String dateOfBirth; // Date of birth
       String nationalInsuranceNumber; // National insurance number
       int employeeId; // Employee ID avoids duplicates
       String jobTitle;
       String jobDepartment;
       double hourlyRate;
       
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter title: ");
       title = scanner.nextLine();
       System.out.print("Enter first name: ");
       firstName = scanner.nextLine();
       System.out.print("Enter last name: ");
       lastName = scanner.nextLine(); //TODO Validation (check other type of employees)
       if(isEmployed(firstName, lastName, hourlyEmployee)){
           System.out.println("Already employed!");
           return; // Stop asking user for input and return to main menu
       }
       System.out.print("Enter date of birth DD-MM-YYYY: ");
       dateOfBirth = scanner.nextLine();
       System.out.print("Enter National Insurance Number: ");
       nationalInsuranceNumber = scanner.nextLine();
       System.out.print("Enter new employee id: ");
       //Scanner.nextInt method does not read the newline character
       //therefore we need to call a nextLine method to be able
       //to read strings properly again
       employeeId = scanner.nextInt(); //TODO Validation     
       scanner.nextLine();
       System.out.print("Enter job title: ");
       jobTitle = scanner.nextLine();
       System.out.print("Enter job department: ");
       jobDepartment = scanner.nextLine();
       System.out.print("Enter hourly rate: ");
       hourlyRate = scanner.nextDouble();
       scanner.nextLine();
       
       hourlyEmployee.add(new HourlyEmployee(hourlyRate, title, firstName, lastName, dateOfBirth, nationalInsuranceNumber, employeeId, jobTitle, jobDepartment));
       System.out.println("Added employee to Hourly group...");
    }
    
    //Methods for searching employees
    public static boolean isEmployed(String firstName, String lastName, ArrayList<HourlyEmployee> hourlyEmployees){
        for(HourlyEmployee employee : hourlyEmployees){
            if(employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName))
                return true;
        }         
        return false;
    }
    
     public static int getIndex(String firstName, String lastName, ArrayList<HourlyEmployee> hourlyEmployee) throws IndexOutOfBoundsException{
        for(HourlyEmployee employee : hourlyEmployee){
            if(employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName))
                return hourlyEmployee.indexOf(employee);
        }         
        return -1;
    }
       
    
    //Getters and setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
}
