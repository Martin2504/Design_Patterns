package c_Behavioral_Patterns.d_Mediator.Mediator;
import c_Behavioral_Patterns.d_Mediator.Components.Component;
import javax.swing.*;

// The mediator interface declares methods used by components
// to notify the mediator about various events. The mediator may
// react to these events and pass the execution to other
// components.

public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}
