package a_Creational_Patterns.b_Abstract_Factory.Factories;
import a_Creational_Patterns.b_Abstract_Factory.Buttons.Button;
import a_Creational_Patterns.b_Abstract_Factory.Checkboxes.Checkbox;

/*  The abstract factory interface declares a set of methods that
return different abstract products. These products are called
a family and are related by a high-level theme or concept.
Products of one family are usually able to collaborate among
themselves. A family of products may have several variants,
but the products of one variant are incompatible with the
products of another variant.
Abstract factory knows about all (abstract) product types. */

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
