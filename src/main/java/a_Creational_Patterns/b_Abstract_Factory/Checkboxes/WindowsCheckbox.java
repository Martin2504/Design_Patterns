package a_Creational_Patterns.b_Abstract_Factory.Checkboxes;

// This is another variant of a checkbox.

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created a windows Checkbox");
    }

}
