package c_Behavioral_Patterns.f_Observer.App;
import c_Behavioral_Patterns.f_Observer.Editor.Editor;
import c_Behavioral_Patterns.f_Observer.Listeners.EmailNotificationListener;
import c_Behavioral_Patterns.f_Observer.Listeners.LogOpenListener;

/*      In this example, the Observer pattern establishes indirect collaboration between objects of a text editor.
Each time the Editor object changes, it notifies its subscribers. EmailNotificationListener and
LogOpenListener react to these notifications by executing their primary behaviors.
Subscriber classes aren’t coupled to the editor class and can be reused in other apps if needed.
The Editor class depends only on the abstract subscriber interface. This allows adding new subscriber
types without changing the editor’s code.     */

// An application can configure publishers and subscribers at runtime.

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
