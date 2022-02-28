package task7.Bridge;

public class Functions {
    protected Device device;
    public Functions(Device device){
        this.device = device;
    }


    public void  volumeDown(){device.setVolume(device.getVolume() - 10);}

    public void  volumeUp() {device.setVolume(device.getVolume() + 10);}

    public void  channelDown(){device.setChannel(device.getChannel() - 1);}

    public void  channelUp(){
        device.setChannel(device.getChannel() + 1);
    }

}
