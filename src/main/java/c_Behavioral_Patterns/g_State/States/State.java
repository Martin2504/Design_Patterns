package c_Behavioral_Patterns.g_State.States;
import c_Behavioral_Patterns.g_State.UI.Player;

// The base state class declares methods that all concrete
// states should implement and also provides a backreference to
// the context object associated with the state. States can use
// the backreference to transition the context to another state.

public abstract class State {
    protected Player player;

    // Context passes itself through the state constructor. This
    // may help a state fetch some useful context data if it's
    // needed.
    public State (Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();

}
