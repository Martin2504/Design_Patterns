package a_Creational_Patterns.a_Factory_Method.App;
import a_Creational_Patterns.a_Factory_Method.Factory.Dialog;
import a_Creational_Patterns.a_Factory_Method.Factory.WebDialog;
import a_Creational_Patterns.a_Factory_Method.Factory.WindowsDialog;

import java.util.Scanner;

public class Application {
    private static Dialog dialog1;

    // The application picks a creator's type depending on the user input.
    public static void initialize() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(1) Windows or (2) Web?");
        int input = scanner.nextInt();

        if (input == 1) {
            dialog1 = new WindowsDialog();
        } else if (input == 2) {
            dialog1 = new WebDialog();
        } else {
            throw new Exception("Error! Unknown OS");
        }
    }

    /*  The client code works with an instance of a concrete
    creator, albeit through its base interface. As long as
    the client keeps working with the creator via the base
    interface, you can pass it any creator's subclass.  */
    public static void main(String[] args) throws Exception {
        initialize();
        dialog1.renderWindow();
    }
}
