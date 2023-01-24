package c_Behavioral_Patterns.b_Command.Commands;
import c_Behavioral_Patterns.b_Command.Editor.Editor;

// Concrete command

public class CopyCommand extends Command {
    // The copy command isn't saved to the history since it
    // doesn't change the editor's state.

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
