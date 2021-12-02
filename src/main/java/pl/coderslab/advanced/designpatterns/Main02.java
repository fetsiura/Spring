package pl.coderslab.advanced.designpatterns;

import java.util.List;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        List<String> barcodes = List.of("D123", "-abc", "Xa-89890", "Xa-120", "wAB");

        for (String barcode : barcodes) {
            Shippable s = ShippingCenter.getByBarcode(barcode);
            System.out.printf("For %s ship by %s", barcode,
                    s != null ? s.getShippingMethod() : "unshippable");
        }
    }
}
