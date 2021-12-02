package pl.coderslab.advanced.designpatterns;

public class ShippingCenter {

    public static Shippable getByBarcode(String barcode) {
        if (barcode.startsWith("D")) {
            return new SimpleProduct();
        } else if (barcode.startsWith("Xa")) {
            return new AdvancedProduct();
        } else if (barcode.startsWith("-")) {
            return new VirtualProduct();
        } else {
            return null;
        }
    }
}
