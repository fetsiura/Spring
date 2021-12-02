package pl.coderslab.advanced.designpatterns;

public class FacebookObserver implements Observer {

    @Override
    public void update(String title) {
        System.out.println("FacebookObserver.update : " + title);
    }
}
