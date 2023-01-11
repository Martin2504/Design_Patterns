package a_Creational_Patterns.b_Abstract_Factory.Checkboxes;

// This is a variant of a checkbox.

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created a MacOSCheckbox");
    }
}
