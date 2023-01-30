package c_Behavioral_Patterns.g_State.States;
import c_Behavioral_Patterns.g_State.UI.Player;

/** Concrete states provide the special implementation for all interface methods.    */

public class LockedState extends State {

    public LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    // When you unlock a locked player, it may assume one of two states.
    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }
    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
