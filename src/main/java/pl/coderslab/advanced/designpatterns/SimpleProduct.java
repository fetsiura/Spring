package pl.coderslab.advanced.designpatterns;

public class SimpleProduct implements Shippable {

    @Override
    public String getShippingMethod() {
        return "post";
    }
}
