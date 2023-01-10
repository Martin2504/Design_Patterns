package a_Creational_Patterns.a_Factory_Method.Factory;
import a_Creational_Patterns.a_Factory_Method.Buttons.Button;
import a_Creational_Patterns.a_Factory_Method.Buttons.WindowsButton;

// Concrete creators override the factory method to change the resulting product's type.

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
