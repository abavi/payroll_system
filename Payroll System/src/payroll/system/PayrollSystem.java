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
        do {
            Menu.printMainMenu();            
            choice = scanner.nextLine();
            //Allowing sub-menus to be printed
            switch (choice) {
                case "1":
                    do{
                        Menu.printRegisterMenu();                        
                        choice = scanner.nextLine();
                    }while(!choice.equalsIgnoreCase("d")); //Going back to the main-menu
                    break;
                case "2":
                    do{
                        Menu.printViewMenu();                        
                        choice = scanner.nextLine();
                    }while(!choice.equalsIgnoreCase("e")); //Going back to the main-menu
                    break;
                case "4":
                    do{
                        Menu.printPayslipMenu();                       
                        choice = scanner.nextLine();
                    }while(!choice.equalsIgnoreCase("d")); //Going back to the main-menu
                    break;
                default:                    
                    break;
            }
        } while (!choice.equals("5"));
    }    
}