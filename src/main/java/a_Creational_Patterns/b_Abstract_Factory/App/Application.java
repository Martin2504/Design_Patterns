package a_Creational_Patterns.b_Abstract_Factory.App;
import a_Creational_Patterns.b_Abstract_Factory.Buttons.Button;
import a_Creational_Patterns.b_Abstract_Factory.Checkboxes.Checkbox;
import a_Creational_Patterns.b_Abstract_Factory.Factories.GUIFactory;

/*  The client code works with factories and products only
through abstract types: GUIFactory, Button and Checkbox. This
lets you pass any factory or product subclass to the client
code without breaking it.
Factory users don't care which concrete factory they use since they work with
factories and products through abstract interfaces.      */

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {        // Constructor
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
