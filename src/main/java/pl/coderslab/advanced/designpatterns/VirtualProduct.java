package pl.coderslab.advanced.designpatterns;

public class VirtualProduct implements Shippable {

    @Override
    public String getShippingMethod() {
        return "email";
    }
}
