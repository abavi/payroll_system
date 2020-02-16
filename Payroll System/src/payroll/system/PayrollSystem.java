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
        
        printMainMenu();
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
    
}
