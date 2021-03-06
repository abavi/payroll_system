package payroll.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sub-class of the Employee parent class to allow different fields.
 * @author Bavi
 */
public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private static ArrayList<Payslip> payslips = new ArrayList<Payslip>();
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
     
     //Method for generating payslips
       public static void generatePayslip(HourlyEmployee employee, String month, int hoursWorked){         
         double monthlyPay = employee.hourlyRate * hoursWorked;
         double taxes = ((20 * monthlyPay) / 100);
         double netPay = monthlyPay - taxes;
         System.out.println("Payslip Period: " + month);
         System.out.println(" ");
         System.out.println("Gross Pay(£): " + monthlyPay);
         System.out.println("Taxes Paid(£): " + taxes);
         System.out.println("Net Pay(£): " + netPay);
         System.out.println("Saved...");
         payslips.add(new Payslip(month, monthlyPay, taxes, netPay));
     }       
     //Method for finding the payslips based on the month the user is looking for
       public static void findPayslip(ArrayList<Payslip> payslips, String month){
        for(Payslip payslip : payslips){
            if(payslip.getMonth().equalsIgnoreCase(month)){
                 System.out.println("Payslip Period: " + payslip.getMonth());
                 System.out.println(" ");
                 System.out.println("Gross Pay(£): " + payslip.getMonthlyPay());
                 System.out.println("Taxes Paid(£): " + payslip.getTaxes());
                 System.out.println("Net Pay(£): " + payslip.getNetPay());
                 System.out.println("Found...");
            }
            else {
                System.out.println(payslip.getMonth());
                System.out.println("Payslip not found...");
            }
        }
    }
     
    
    //Getters and setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public static ArrayList<Payslip> getPayslips() {
        return payslips;
    }
    
}
