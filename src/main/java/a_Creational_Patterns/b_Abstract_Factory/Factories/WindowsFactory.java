package a_Creational_Patterns.b_Abstract_Factory.Factories;
import a_Creational_Patterns.b_Abstract_Factory.Buttons.Button;
import a_Creational_Patterns.b_Abstract_Factory.Buttons.WindowsButton;
import a_Creational_Patterns.b_Abstract_Factory.Checkboxes.Checkbox;
import a_Creational_Patterns.b_Abstract_Factory.Checkboxes.WindowsCheckbox;

/*  Concrete factories produce a family of products that belong
to a single variant. The factory guarantees that the
resulting products are compatible. Signatures of the concrete
factory's methods return an abstract product, while inside
the method a concrete product is instantiated.
Each concrete factory extends basic factory and responsible for creating
products of a single variety.   */

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
