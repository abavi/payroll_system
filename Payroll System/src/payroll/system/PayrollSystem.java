package payroll.system;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Bavi
 */
public class PayrollSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
       //TODO Move to Menu Class
       String choice;
       Scanner scanner = new Scanner(System.in);
        
       //Local Variables to allow the user to create the Employee Forms
       String title;
       String firstName;
       String lastName;
       String dateOfBirth; // Date of birth
       String nationalInsuranceNumber; // National insurance number
       int employeeId; // Employee ID avoids duplicates
       String jobTitle;
       String jobDepartment;
       
       //Variables for the extended Employees
       String contractType; // Full-time or part-time
       int annualSalary;
       double hourlyRate;
       int annualGrossSalary;
       double commissionRate;
        
        //Creating the four Employee ArrayLists to allow viewing and removing
        //ArrayList<Employee> allEmployees = new ArrayList<>();
        ArrayList<SalariedEmployee> salariedEmployees = new ArrayList<SalariedEmployee>();
        ArrayList<HourlyEmployee> hourlyEmployees = new ArrayList<HourlyEmployee>();        
        ArrayList<CommissionEmployee> commissionEmployees = new ArrayList<CommissionEmployee>();
        
        //Populating with 3 Employees of each type        
        //Salaried Employees     
        salariedEmployees.add(new SalariedEmployee("Full Time", 16000, "Mr", "Steve", "Jobs", "26-02-1955", "SX1234D", 1, "Manager", "HR"));        
        //Hourly Employees
        hourlyEmployees.add(new HourlyEmployee(8.7, "Mr", "Freddy", "Kruger", "01-03-1940", "SJ3321Q", 2, "Dream Manager", "Ghosting"));
        //Commision Employees
        commissionEmployees.add(new CommissionEmployee(15000, 5.5, "Ms", "Bella", "Hadid", "20-05-1994", "SB3245K", 3, "Model", "Modelling"));
        
        //Printing the main menu on screen and allowing user input       
        do {
            Menu.printMainMenu();            
            choice = scanner.nextLine();
            //Allowing sub-menus to be printed
            switch (choice) {
                case "1":
                    do{
                        Menu.printRegisterMenu();                        
                        choice = scanner.nextLine();
                        if(choice.equalsIgnoreCase("a")){
                            System.out.println("Enter Salaried Employees Details...");
                            SalariedEmployee.enterDetails(salariedEmployees);
                        }
                        else if(choice.equalsIgnoreCase("b")){
                            System.out.println("Enter Hourly Employees Details...");
                            HourlyEmployee.enterDetails(hourlyEmployees);
                        }
                        else if(choice.equalsIgnoreCase("c")){
                            System.out.println("Enter Commission Employees Details...");
                            CommissionEmployee.enterDetails(commissionEmployees);
                        }
                    }while(!choice.equalsIgnoreCase("d")); //Going back to the main-menu
                    break;
                case "2":
                    do{
                        Menu.printViewMenu();                        
                        choice = scanner.nextLine();
                        if(choice.equalsIgnoreCase("a")){
                            System.out.println("Printing all employees...");
                            SalariedEmployee.printList(salariedEmployees);
                            HourlyEmployee.printList(hourlyEmployees);
                            CommissionEmployee.printList(commissionEmployees);                            
                        }
                        else if(choice.equalsIgnoreCase("b")){
                            System.out.println("Printing salaried employees...");                            
                            SalariedEmployee.printList(salariedEmployees);
                        }
                        else if(choice.equalsIgnoreCase("c")) {
                            System.out.println("Printing hourly employees...");
                            HourlyEmployee.printList(hourlyEmployees);
                        }
                        else if(choice.equalsIgnoreCase("d")){
                            System.out.println("Printing commission employees...");
                            CommissionEmployee.printList(commissionEmployees);
                        }
                    }while(!choice.equalsIgnoreCase("e")); //Going back to the main-menu
                    break;
                case "3":
                    System.out.println("REMOVED");
                    break;
                case "4":
                    do{
                        Menu.printPayslipMenu();                       
                        choice = scanner.nextLine();
                    }while(!choice.equalsIgnoreCase("d")); //Going back to the main-menu
                    break;
                case "5":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("<-------------- Invalid Choice! ----------------->");
                    break;
            }
        } while (!choice.equals("5"));       
            
        }

 }  
    
    