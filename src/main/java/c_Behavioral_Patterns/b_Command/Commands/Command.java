package c_Behavioral_Patterns.b_Command.Commands;
import c_Behavioral_Patterns.b_Command.Editor.Editor;

// The base command class defines the common interface for all
// concrete commands.

public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    // Make a backup of the editor's state.
    void backup() {
        backup = editor.textField.getText();
    }

    // Restore the editor's state.
    public void undo() {
        editor.textField.setText(backup);
    }

    // The execution method is declared abstract to force all
    // concrete commands to provide their own implementations.
    // The method must return true or false depending on whether
    // the command changes the editor's state.
    public abstract boolean execute();

}
