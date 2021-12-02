package pl.coderslab.advanced.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject {

    private String title;
    private String content;

    private List<Observer> observers = new ArrayList<>();

    public void share() {
        System.out.println("Publikuję się...");
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
        for (Observer o : observers) {
            o.update(title);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
