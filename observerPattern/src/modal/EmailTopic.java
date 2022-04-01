package modal;

import interfaces.Observer;
import interfaces.Publisher;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Publisher {
    private List<Observer> observers = new ArrayList<>();
    private String message;
    private String topicName;

    public EmailTopic(String topicName) {
        this.topicName = topicName;
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("passed a null observer");
        }

        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public String getUpdate() {
        return this.message; // 什么时候用this? 这个时候返回用了
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void postMessage(String message) {
        this.message = message;
        notifyObservers();
    }

}
