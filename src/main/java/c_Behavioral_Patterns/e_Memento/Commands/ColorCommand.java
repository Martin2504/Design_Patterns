package c_Behavioral_Patterns.e_Memento.Commands;
import c_Behavioral_Patterns.e_Memento.Editor.Editor;
import c_Behavioral_Patterns.e_Memento.Shapes.Shape;
import java.awt.*;

public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
