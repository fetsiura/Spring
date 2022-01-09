package pl.coderslab.SpringDay4.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CartItem {

    private Integer quantity;
    private Product product;
}
