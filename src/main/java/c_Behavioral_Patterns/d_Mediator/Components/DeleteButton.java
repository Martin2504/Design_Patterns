package c_Behavioral_Patterns.d_Mediator.Components;
import c_Behavioral_Patterns.d_Mediator.Mediator.Mediator;
import java.awt.event.ActionEvent;
import javax.swing.*;

/** Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator. */

public class DeleteButton extends JButton implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}
