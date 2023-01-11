package a_Creational_Patterns.b_Abstract_Factory.Buttons;

/*  Concrete products are created by corresponding concrete
factories.
All products families have the same varieties (MacOS/Windows).
This is a MacOS variant of a button.    */

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a MacOSButton");
    }
}
