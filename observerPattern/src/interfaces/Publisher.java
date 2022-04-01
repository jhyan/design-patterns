package interfaces;

public interface Publisher {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public Object getUpdate();
    public void notifyObservers();
}
