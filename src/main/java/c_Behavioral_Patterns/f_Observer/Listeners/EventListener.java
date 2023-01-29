package c_Behavioral_Patterns.f_Observer.Listeners;
import java.io.File;

// Here's the subscriber interface. If the programming language
// supports functional types, you can replace the whole
// subscriber hierarchy with a set of functions.

public interface EventListener {
    void update(String eventType, File file);
}
