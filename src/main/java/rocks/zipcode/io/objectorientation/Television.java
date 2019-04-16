package rocks.zipcode.io.objectorientation;

public class Television {
    TVChannel currentChannel;
    public void turnOn() {
        currentChannel = TVChannel.getByOrdinal(0);
    }

    public void setChannel(Integer channel) throws IllegalStateException {
        currentChannel = TVChannel.getByOrdinal(channel);
    }

    public TVChannel getChannel() {
        return currentChannel;
    }
}
