package b_Structural_Patterns.b_Bridge.Remotes;
import b_Structural_Patterns.b_Bridge.Devices.Device;

// You can extend classes from the abstraction hierarchy
// independently from device classes.

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
