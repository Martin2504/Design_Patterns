package a_Creational_Patterns.b_Abstract_Factory.Checkboxes;

/*  Here's the base interface of another product. All products
can interact with each other, but proper interaction is
possible only between products of the same concrete variant.
Checkboxes is the second product family. It has the same variants as buttons.    */

public interface Checkbox {
    void paint();
}
