package b_Structural_Patterns.b_Bridge.App;
import b_Structural_Patterns.b_Bridge.Devices.Device;
import b_Structural_Patterns.b_Bridge.Devices.Radio;
import b_Structural_Patterns.b_Bridge.Devices.Tv;
import b_Structural_Patterns.b_Bridge.Remotes.AdvancedRemote;
import b_Structural_Patterns.b_Bridge.Remotes.BasicRemote;

public class Application {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
