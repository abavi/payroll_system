package payroll.system;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * The core class of the Payroll System. This is what the user runs.
 * @author Bavi
 */
public class PayrollSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
       String choice;
       Scanner scanner = new Scanner(System.in);
       
       //Variable for moth of payslip
       String month;
       int hoursWorked; // variable for worked hours
       //Local Variables to allow the user to create the Employee Forms      
       String firstName;
       String lastName;      
        
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
                case "1": // Adding employees in the system
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
                case "2": // Printing the employees or searching for particular employee
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
                        else if(choice.equalsIgnoreCase("e")){
                            System.out.println("Searching employees...");
                            System.out.print("Enter first name: ");
                            firstName = scanner.nextLine();
                            System.out.print("Enter last name: ");
                            lastName = scanner.nextLine();
                            // Searching in each group of employees. One employee can't be in 2 groups
                            if(SalariedEmployee.isEmployed(firstName, lastName, salariedEmployees)){
                                System.out.println("Found in Salaried Employees");
                            }
                            else if(HourlyEmployee.isEmployed(firstName, lastName, hourlyEmployees)){
                                System.out.println("Found in Hourly Employees");
                            }
                            else if(CommissionEmployee.isEmployed(firstName, lastName, commissionEmployees)){
                                System.out.println("Found in Commission Employees");
                            }
                            else {
                                System.out.println("Employee not found!");
                            }
                        }
                    }while(!choice.equalsIgnoreCase("f")); //Going back to the main-menu
                    break;
                case "3": // Removing employee by looking in each group based on first and last name                    
                    System.out.println("Removing employee...");
                    System.out.print("Enter first name: ");
                    firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    lastName = scanner.nextLine();
                    
                     if(SalariedEmployee.isEmployed(firstName, lastName, salariedEmployees)){
                                salariedEmployees.remove(SalariedEmployee.getIndex(firstName, lastName, salariedEmployees));
                                System.out.println("Removed from Salaried Employees!");
                            }
                            else if(HourlyEmployee.isEmployed(firstName, lastName, hourlyEmployees)){
                                hourlyEmployees.remove(HourlyEmployee.getIndex(firstName, lastName, hourlyEmployees));
                                System.out.println("Removed from Hourly Employees!");
                            }
                            else if(CommissionEmployee.isEmployed(firstName, lastName, commissionEmployees)){
                                commissionEmployees.remove(CommissionEmployee.getIndex(firstName, lastName, commissionEmployees));
                                System.out.println("Removed from Commission Employees!");
                            }
                            else {
                                System.out.println("Employee not found!");
                            }
                    break;
                case "4": //Storing and viewing payslips for each employee
                    do{
                        Menu.printPayslipMenu();                       
                        choice = scanner.nextLine();
                        if(choice.equalsIgnoreCase("a")){
                            do{
                                Menu.printSubPayslipMenu();
                                choice = scanner.nextLine();
                                if(choice.equalsIgnoreCase("a")){
                                    System.out.print("Enter payslip period: ");
                                    month = scanner.nextLine();
                                    System.out.println("Enter the first and last name of the employee: ");
                                    System.out.print("Enter first name: ");
                                    firstName = scanner.nextLine();
                                    System.out.print("Enter last name: ");
                                    lastName = scanner.nextLine();
                                    SalariedEmployee employee = salariedEmployees.get(SalariedEmployee.getIndex(firstName, lastName, salariedEmployees));
                                    SalariedEmployee.generatePayslip(employee, month);
                                }
                                else if(choice.equalsIgnoreCase("b")){
                                     System.out.print("Enter payslip period: ");
                                     month = scanner.nextLine();
                                     System.out.println("Enter the first and last name of the employee: ");
                                     System.out.print("Enter first name: ");
                                     firstName = scanner.nextLine();
                                     System.out.print("Enter last name: ");
                                     lastName = scanner.nextLine();
                                     SalariedEmployee employee = salariedEmployees.get(SalariedEmployee.getIndex(firstName, lastName, salariedEmployees));
                                     SalariedEmployee.findPayslip(employee.getPayslips(), month);
                                }
                            }while(choice.equalsIgnoreCase("c"));                            
                            
                        }
                        else if(choice.equalsIgnoreCase("b")){
                            do {
                                Menu.printSubPayslipMenu();
                                choice = scanner.nextLine();
                                if(choice.equalsIgnoreCase("a")){
                                    System.out.print("Enter payslip period: ");
                                    month = scanner.nextLine();
                                    System.out.println("Enter the first and last name of the employee: ");
                                    System.out.print("Enter first name: ");
                                    firstName = scanner.nextLine();
                                    System.out.print("Enter last name: ");
                                    lastName = scanner.nextLine();
                                    System.out.print("Enter hours worked: ");
                                    hoursWorked = scanner.nextInt();
                                    scanner.nextLine();
                                    HourlyEmployee employee = hourlyEmployees.get(HourlyEmployee.getIndex(firstName, lastName, hourlyEmployees));
                                    HourlyEmployee.generatePayslip(employee, month, hoursWorked);
                                }
                                else if(choice.equalsIgnoreCase("b")){
                                    System.out.print("Enter payslip period: ");
                                    month = scanner.nextLine();
                                    System.out.println("Enter the first and last name of the employee: ");
                                    System.out.print("Enter first name: ");
                                    firstName = scanner.nextLine();
                                    System.out.print("Enter last name: ");
                                    lastName = scanner.nextLine();                            
                                    HourlyEmployee employee = hourlyEmployees.get(HourlyEmployee.getIndex(firstName, lastName, hourlyEmployees));
                                    HourlyEmployee.findPayslip(employee.getPayslips(), month);
                                }
                            }while(choice.equalsIgnoreCase("c"));
                            
                        }
                        else if(choice.equalsIgnoreCase("c")){
                            do{
                                Menu.printSubPayslipMenu();
                                choice = scanner.nextLine();
                                if(choice.equalsIgnoreCase("a")){
                                    System.out.print("Enter payslip period: ");
                                    month = scanner.nextLine();
                                    System.out.println("Enter the first and last name of the employee: ");
                                    System.out.print("Enter first name: ");
                                    firstName = scanner.nextLine();
                                    System.out.print("Enter last name: ");
                                    lastName = scanner.nextLine();
                                    CommissionEmployee employee = commissionEmployees.get(CommissionEmployee.getIndex(firstName, lastName, commissionEmployees));
                                    CommissionEmployee.generatePayslip(employee, month);
                                }
                                else if(choice.equalsIgnoreCase("b")){
                                    System.out.print("Enter payslip period: ");
                                    month = scanner.nextLine();
                                    System.out.println("Enter the first and last name of the employee: ");
                                    System.out.print("Enter first name: ");
                                    firstName = scanner.nextLine();
                                    System.out.print("Enter last name: ");
                                    lastName = scanner.nextLine();
                                    CommissionEmployee employee = commissionEmployees.get(CommissionEmployee.getIndex(firstName, lastName, commissionEmployees));
                                    CommissionEmployee.findPayslip(employee.getPayslips(), month);
                                }
                            }while(choice.equalsIgnoreCase("c"));                            
                        }
                    }while(!choice.equalsIgnoreCase("d")); //Going back to the main-menu
                    break;
                case "5": // Closing the application
                    System.out.println("Exiting...");
                    break;
                default: // In case the user inputs none of the cases presented
                    System.out.println("<-------------- Invalid Choice! ----------------->");
                    break;
            }
        } while (!choice.equals("5"));       
            
        }

 }  
    
    