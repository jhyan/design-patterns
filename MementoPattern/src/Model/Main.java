package Model;

public class Main {
    public static void main(String[] args) {
        Originator character = new Originator("Monster0");
        TakeCarer takeCarer = new TakeCarer();

        Memento memento = character.createMemento();
        takeCarer.addMemento(memento);

        character.setState("Monster1");
        memento = character.createMemento();
        takeCarer.addMemento(memento);

        character.setState("Monster2");
        memento = character.createMemento();
        takeCarer.addMemento(memento);

        memento = takeCarer.getMemento(0);
        character.setMemento(memento);
        System.out.println(character.getState());

        memento = takeCarer.getMemento(1);
        character.setMemento(memento);
        System.out.println(character.getState());
    }
}
