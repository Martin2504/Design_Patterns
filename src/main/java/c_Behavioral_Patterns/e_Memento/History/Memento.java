package c_Behavioral_Patterns.e_Memento.History;
import c_Behavioral_Patterns.e_Memento.Editor.Editor;

// The memento class stores the past state of the editor.
public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    // At some point, a previous state of the editor can be
    // restored using a memento object.
    public void restore() {
        editor.restore(backup);
    }
}
