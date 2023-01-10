package a_Creational_Patterns.a_Factory_Method.Buttons;

// Concrete products provide various implementations of the product interface.

public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
