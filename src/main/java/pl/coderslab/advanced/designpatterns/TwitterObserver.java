package pl.coderslab.advanced.designpatterns;

public class TwitterObserver implements Observer {

    @Override
    public void update(String title) {
        System.out.println("TwitterObserver.update " + title);
    }
}
