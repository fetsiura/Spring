package pl.coderslab.advanced.designpatterns.zad4;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject {
    private String content;
    private String title;
    List<Observer> observers = new ArrayList<>();

    public void share() {
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(title));
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
