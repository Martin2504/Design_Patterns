package c_Behavioral_Patterns.d_Mediator.App;
import javax.swing.*;
import c_Behavioral_Patterns.d_Mediator.Mediator.Editor;
import c_Behavioral_Patterns.d_Mediator.Mediator.Mediator;
import c_Behavioral_Patterns.d_Mediator.Components.*;

public class Application {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}