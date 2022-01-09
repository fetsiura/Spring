package pl.coderslab.SpringDay4.model;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductDao {

    private List<Product> products = List.of(
            new Product(1L, "Miś", 55.00),
            new Product(2L, "Bakłażan", 8.0),
            new Product(3L, "Piła mechaniczna", 399.99)
    );

    public List<Product> getProducts() {
        return products;
    }

    public Optional<Product> getProduct(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findAny();
    }
}
