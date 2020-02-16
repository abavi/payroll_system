package payroll.system;
import java.util.Scanner;

/**
 *
 * @author Bavi
 */
public class PayrollSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Printing the main menu on screen and allowing user input
        String choice;
        Scanner scanner = new Scanner(System.in);
        //TODO Move Menu functionality in a class
        //TODO Add choice validation
        do {
            printMainMenu();
            System.out.print("Please enter your option: ");
            choice = scanner.nextLine();
            //Allowing sub-menus to be printed
            switch (choice) {
                case "1":
                    do{
                        printRegisterMenu();
                        System.out.print("Please enter your option: ");
                        choice = scanner.nextLine();
                    }while(!choice.equals("d")); //Going back to the main-menu
                    break;
                case "2":
                    do{
                        printViewMenu();
                        System.out.print("Please enter your option: ");
                        choice = scanner.nextLine();
                    }while(!choice.equals("e")); //Going back to the main-menu
                    break;
                case "4":
                    do{
                        printPayslipMenu();
                        System.out.print("Please enter your option: ");
                        choice = scanner.nextLine();
                    }while(!choice.equals("d")); //Going back to the main-menu
                    break;
                default:                    
                    break;
            }
        } while (!choice.equals("5"));
    }
    
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
    }
    
    //TODO Add sub-menus for 1 2 4
    
    //Sub-menu for registering an employee to the system
    public static void printRegisterMenu(){
        System.out.println( "***********************"
                +           "\n*  Register Employee  *" 
                +           "\n***********************"                
                +           "\na. Salaried Employees"
                +           "\nb. Hourly Employees"
                +           "\nc. Commission Employees"
                +           "\nd. Back");
    }
    
    //Sub-menu for viewing an employee
    public static void printViewMenu(){
        System.out.println( "********************"
                +           "\n*  View Employees  *" 
                +           "\n********************"                
                +           "\na. All Employees"
                +           "\nb. Salaried Employees"
                +           "\nc. Hourly Employees"
                +           "\nd. Commission Employees"
                +           "\ne. Back");
    }
    
    //Sub-menu for generating pay-slips
    public static void printPayslipMenu(){
        System.out.println( "************************"
                +           "\n*  Generate pay slips  *" 
                +           "\n************************"                
                +           "\na. Salaried Employees"
                +           "\nb. Hourly Employees"
                +           "\nc. Commission Employees"
                +           "\nd. Back");
    }
}
    

