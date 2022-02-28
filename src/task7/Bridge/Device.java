package task7.Bridge;

public interface Device {
    void isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percent);
    int getChannel();
    void setChannel(int percent);
}
