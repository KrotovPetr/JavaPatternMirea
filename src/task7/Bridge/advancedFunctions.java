package task7.Bridge;

public class advancedFunctions extends  Functions{

    public advancedFunctions(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

}
