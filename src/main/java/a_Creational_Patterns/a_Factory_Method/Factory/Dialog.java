package a_Creational_Patterns.a_Factory_Method.Factory;

/*  The creator class declares the factory method that must
return an object of a product class. The creator's subclasses
usually provide the implementation of this method.   */

import a_Creational_Patterns.a_Factory_Method.Buttons.Button;

public abstract class Dialog {
    // The creator may also provide some default implementation of the factory method.
    public abstract Button createButton();

    /*  Note that, despite its name, the creator's primary
    responsibility isn't creating products. It usually
    contains some core business logic that relies on product
    objects returned by the factory method. Subclasses can
    indirectly change that business logic by overriding the
    factory method and returning a different type of product
    from it.    */


    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

}
