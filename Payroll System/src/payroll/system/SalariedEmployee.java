package payroll.system;

import java.util.ArrayList;
import java.util.Scanner;

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
            System.out.println(employee.getTitle() + " | " + employee.getFirstName() + " " + employee.getLastName() + " | " + employee.getDateOfBirth()
                     + " | " + employee.getNationalInsuranceNumber() + " | " + employee.getEmployeeId() + " | " + employee.getJobTitle()
                     + " | " + employee.getJobDepartment() + " | " + employee.contractType
                     + " | " + employee.annualSalary + " | ");
        }
    }
    
     public static void enterDetails(ArrayList<SalariedEmployee> salariedEmployees){
        //Local Variables to allow the user to create the Salaried Employee
       String title;
       String firstName;
       String lastName;
       String dateOfBirth; // Date of birth
       String nationalInsuranceNumber; // National insurance number
       int employeeId; // Employee ID avoids duplicates
       String jobTitle;
       String jobDepartment;
       String contractType; // Full-time or part-time
       int annualSalary;
       
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter title: ");
       title = scanner.nextLine();
       System.out.print("Enter first name: ");
       firstName = scanner.nextLine();
       System.out.print("Enter last name: ");
       lastName = scanner.nextLine(); //TODO Validation (check other type of employees)
       if(isEmployed(firstName, lastName, salariedEmployees)){
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
       System.out.print("Enter contract type: ");
       contractType = scanner.nextLine();
       System.out.print("Enter annual salary: ");
       annualSalary = scanner.nextInt();
       scanner.nextLine();
       
       //Adding the employee to the list
       salariedEmployees.add(new SalariedEmployee(contractType, annualSalary, title, firstName, lastName, dateOfBirth, nationalInsuranceNumber, employeeId, jobTitle, jobDepartment));
       System.out.println("Added employee to Salaried group...");
    }
     
     //Methods for searching employees
     public static boolean isEmployed(String firstName, String lastName, ArrayList<SalariedEmployee> salariedEmployees){
         for(SalariedEmployee employee : salariedEmployees){
             if(employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName))
                 return true;
         }         
         return false;
     }
     
     public static int getIndex(String firstName, String lastName, ArrayList<SalariedEmployee> salariedEmployees) throws IndexOutOfBoundsException{
         for(SalariedEmployee employee : salariedEmployees){
             if(employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName))
                 return salariedEmployees.indexOf(employee);
         }         
         return -1;
     }
     //Method for generating payslip
     public static void generatePayslip(SalariedEmployee employee, String month){         
         double monthlyPay = employee.annualSalary / 12;
         double taxes = ((20 * monthlyPay) / 100);
         double netPay = monthlyPay - taxes;
         System.out.println("Payslip Period: " + month);
         System.out.println(" ");
         System.out.println("Gross Pay(£): " + monthlyPay);
         System.out.println("Taxes Paid(£): " + taxes);
         System.out.println("Net Pay(£): " + netPay);         
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
