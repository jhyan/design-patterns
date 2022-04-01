package modal;

import interfaces.Observer;

public class testObserverPattern {
    public static void main (String[] args) {
        EmailTopic sports = new EmailTopic("Sports");

        Observer alice = new EmailTopicSubcriber("Alice");
        Observer bob = new EmailTopicSubcriber("Bob");

        sports.register(alice);
        sports.register(bob);
        alice.setPublisher(sports);
        bob.setPublisher(sports);

        sports.postMessage("game 1 is going on!");
        sports.unregister(bob);
        sports.postMessage("game 2 is going on!");
    }
}
