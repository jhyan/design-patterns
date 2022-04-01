package modal;

import interfaces.Observer;
import interfaces.Publisher;

public class EmailTopicSubcriber implements Observer {
    private Publisher topic;
    private String name;

    public EmailTopicSubcriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (this.topic == null) {
            throw new NullPointerException(this.name + "haven't subscribed any subject yet");
        }
        String msg = (String) this.topic.getUpdate();
        if (msg == null) {
            System.out.println("no messages yet");
        } else {
            System.out.println(name + " retrieving message " + msg);
        }
    }

    @Override
    public void setPublisher(Publisher topic) {
        this.topic = topic;
    }
}
