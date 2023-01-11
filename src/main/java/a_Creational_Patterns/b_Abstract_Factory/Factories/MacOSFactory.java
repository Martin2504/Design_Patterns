package a_Creational_Patterns.b_Abstract_Factory.Factories;
import a_Creational_Patterns.b_Abstract_Factory.Buttons.Button;
import a_Creational_Patterns.b_Abstract_Factory.Buttons.MacOSButton;
import a_Creational_Patterns.b_Abstract_Factory.Checkboxes.Checkbox;
import a_Creational_Patterns.b_Abstract_Factory.Checkboxes.MacOSCheckbox;

/*   Each concrete factory has a corresponding product variant.
Each concrete factory extends basic factory and responsible for creating
products of a single variety.    */

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
