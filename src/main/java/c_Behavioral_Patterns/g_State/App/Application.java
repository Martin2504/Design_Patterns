package c_Behavioral_Patterns.g_State.App;
import c_Behavioral_Patterns.g_State.UI.Player;
import c_Behavioral_Patterns.g_State.UI.UI;

public class Application {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
