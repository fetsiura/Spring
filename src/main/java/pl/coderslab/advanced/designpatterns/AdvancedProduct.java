package pl.coderslab.advanced.designpatterns;

public class AdvancedProduct implements Shippable {

    @Override
    public String getShippingMethod() {
        return "courier";
    }
}
