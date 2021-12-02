package pl.coderslab.advanced.designpatterns;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
