package pl.coderslab.advanced.designpatterns.zad4;

public class FacebookObserver implements Observer{
    @Override
    public void update(String title) {
        System.out.println("Public facebook" + title);
    }
}
