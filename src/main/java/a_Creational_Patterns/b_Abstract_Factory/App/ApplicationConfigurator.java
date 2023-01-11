package a_Creational_Patterns.b_Abstract_Factory.App;
import a_Creational_Patterns.b_Abstract_Factory.Factories.GUIFactory;
import a_Creational_Patterns.b_Abstract_Factory.Factories.MacOSFactory;
import a_Creational_Patterns.b_Abstract_Factory.Factories.WindowsFactory;
import java.util.Scanner;

/*  The application picks the factory type depending on the
current configuration or environment settings and creates it
at runtime (usually at the initialization stage).
I have made the user select their OS, but the code for the above
is commented out.   */

public class ApplicationConfigurator {
    private static Application configureApplication() throws Exception {
        Application app;
        GUIFactory factory;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select OS: \n\t(1) Windows \n\t(2) Mac");
        int answer = scanner.nextInt();
        if (answer == 1) {
            factory = new WindowsFactory();
        } else if (answer == 2) {
            factory = new MacOSFactory();
        } else {
            throw new Exception("Error! Unknown operating system");
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) throws Exception {
        Application app = configureApplication();
        app.paint();
    }
}
