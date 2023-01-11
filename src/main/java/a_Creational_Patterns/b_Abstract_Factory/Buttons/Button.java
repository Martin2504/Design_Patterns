package a_Creational_Patterns.b_Abstract_Factory.Buttons;

/*  Each distinct product of a product family should have a base
interface. All variants of the product must implement this
interface.
Abstract Factory assumes that you have several families of products,
structured into separate class hierarchies (Button/Checkbox). All products of
the same family have the common interface.
This is the common interface for buttons family.    */

public interface Button {
    void paint();
}
