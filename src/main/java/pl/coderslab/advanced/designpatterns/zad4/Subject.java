package pl.coderslab.advanced.designpatterns.zad4;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();

}