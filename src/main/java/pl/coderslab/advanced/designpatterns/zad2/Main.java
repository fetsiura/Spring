package pl.coderslab.advanced.designpatterns.zad2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = List.of(
                new VirtualProduct(),
                new AdvancedProduct(),
                new SimpleProduct()
        );

        products.forEach(product -> System.out.println(product.getName()));

    }
}
