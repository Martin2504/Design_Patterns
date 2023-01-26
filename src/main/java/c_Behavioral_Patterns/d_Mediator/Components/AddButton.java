package c_Behavioral_Patterns.d_Mediator.Components;
import javax.swing.*;
import java.awt.event.ActionEvent;
import c_Behavioral_Patterns.d_Mediator.Mediator.Mediator;
import c_Behavioral_Patterns.d_Mediator.Mediator.Note;

/** Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator. */

public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
