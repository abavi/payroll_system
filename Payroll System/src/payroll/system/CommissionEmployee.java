package payroll.system;

import java.util.ArrayList;
import java.util.Scanner;

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
            System.out.println(employee.getTitle() + " | " + employee.getFirstName() + " " + employee.getLastName() + " | " + employee.getDateOfBirth()
                     + " | " + employee.getNationalInsuranceNumber() + " | " + employee.getEmployeeId() + " | " + employee.getJobTitle()
                     + " | " + employee.getJobDepartment() + " | " + employee.annualGrossSalary
                     + " | " + employee.commissionRate + " | ");
        }
    }
    
    public static void enterDetails(ArrayList<CommissionEmployee> commissionEmployees){
        //Local Variables to allow the user to create the Salaried Employee
       String title;
       String firstName;
       String lastName;
       String dateOfBirth; // Date of birth
       String nationalInsuranceNumber; // National insurance number
       int employeeId; // Employee ID avoids duplicates
       String jobTitle;
       String jobDepartment;
       int annualGrossSalary;
       double commissionRate;
       
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter title: ");
       title = scanner.nextLine();
       System.out.print("Enter first name: ");
       firstName = scanner.nextLine();
       System.out.print("Enter last name: ");
       lastName = scanner.nextLine(); //TODO Validation (check other type of employees)
       if(isEmployed(firstName, lastName, commissionEmployees)){
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
       System.out.print("Enter gross salary: ");
       annualGrossSalary = scanner.nextInt();
       System.out.print("Enter commission rate: ");
       commissionRate = scanner.nextDouble();
       scanner.nextLine();
       //Adding the employee to the list
       commissionEmployees.add(new CommissionEmployee(annualGrossSalary, commissionRate, title, firstName, lastName, dateOfBirth, nationalInsuranceNumber,
               employeeId, jobTitle, jobDepartment));
       System.out.println("Added employee to Commission group...");
    }
    
    //Methods for searching employees
    public static boolean isEmployed(String firstName, String lastName, ArrayList<CommissionEmployee> commissionEmployees){
         for(CommissionEmployee employee : commissionEmployees){
             if(employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName))
                 return true;
         }         
         return false;
     }
    
     public static int getIndex(String firstName, String lastName, ArrayList<CommissionEmployee> commissionEmployee) throws IndexOutOfBoundsException{
        for(CommissionEmployee employee : commissionEmployee){
            if(employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName))
                return commissionEmployee.indexOf(employee);
        }         
        return -1;
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
