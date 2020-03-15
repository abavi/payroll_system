package payroll.system;
/**
 * Menu class used for de-cluttering the main class 
 * @author Bavi
 */
public class Menu {    
     // Method to print the initial main menu
     public static void printMainMenu(){
        System.out.println("********************"
                +           "\n*  Payroll System  *" 
                +           "\n********************"
                +           "\n1. Register Employee"
                +           "\n2. View Employee"
                +           "\n3. Remove employee"
                +           "\n4. Generate Pay slip"
                +           "\n5. Exit");
        System.out.print("Please enter your option: ");
    }
     
    // Sub-menu for registering an employee to the system
    public static void printRegisterMenu(){
        System.out.println( "***********************"
                +           "\n*  Register Employee  *" 
                +           "\n***********************"                
                +           "\na. Salaried Employees"
                +           "\nb. Hourly Employees"
                +           "\nc. Commission Employees"
                +           "\nd. Back");
        System.out.print("Please enter your option: ");
    }
     
    // Sub-menu for viewing an employee
    public static void printViewMenu(){
        System.out.println( "********************"
                +           "\n*  View Employees  *" 
                +           "\n********************"                
                +           "\na. All Employees"
                +           "\nb. Salaried Employees"
                +           "\nc. Hourly Employees"
                +           "\nd. Commission Employees"
                +           "\ne. Search Employees"
                +           "\nf. Back");
        System.out.print("Please enter your option: ");
    }
    
    // Sub-menu for generating pay-slips
    public static void printPayslipMenu(){
        System.out.println( "************************"
                +           "\n*  Generate pay slips  *" 
                +           "\n************************"                
                +           "\na. Salaried Employees"
                +           "\nb. Hourly Employees"
                +           "\nc. Commission Employees"
                +           "\nd. Back");
        System.out.print("Please enter your option: ");
    }
    
    public static void printSubPayslipMenu(){
        System.out.println( "************************"
                +           "\n*  Generate pay slips  *" 
                +           "\n************************"                
                +           "\na. New payslip"
                +           "\nb. See payslips"
                +           "\nc. Back"
        );
        System.out.print("Please enter your option: ");
    }
}
