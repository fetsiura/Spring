package pl.coderslab.SpringDay4.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.SpringDay4.model.Cart;
import pl.coderslab.SpringDay4.model.CartItem;
import pl.coderslab.SpringDay4.model.Product;
import pl.coderslab.SpringDay4.model.ProductDao;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Slf4j
@Controller

public class CartController {

    private Cart cart;
    private ProductDao productDao;

    @Autowired
    public CartController(Cart cart, ProductDao productDao) {
        this.cart = cart;
        this.productDao = productDao;
    }

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addtocart(@RequestParam(defaultValue = "1") int quantity,
                            @RequestParam Long id) {
        productDao.getProduct(id)
                .map(product -> new CartItem(quantity, product))
                .ifPresent(cart.getCartItems()::add);

        return "Product dodany <br> <a href=\"http://localhost:8080/cart\">Go to cart</a>";

    }

    @RequestMapping(value = "/cart", produces = "text/plain; charset=utf-8")
    @ResponseBody
    public String cart() {
        StringBuilder sb = new StringBuilder();
        sb.append(cart.getCartItems().stream()
                .map(cartItem -> String.format("%d x %s (%.2f)",
                        cartItem.getQuantity(),
                        cartItem.getProduct().getName(),
                        cartItem.getProduct().getPrice()
                ))
                .collect(Collectors.joining("\n")));
        sb.append(String.format("%nW koszyku jest %d pozycji",
                cart.getCartItems().size()));
        sb.append(String.format("%nW koszyku jest %d produktów",
                cart.getCartItems().stream().mapToInt(CartItem::getQuantity).sum()));
        sb.append(String.format("%nWartość koszyka to: %.2f",
                cart.getCartItems().stream()
                        .mapToDouble(cartItem -> cartItem.getQuantity() * cartItem.getProduct().getPrice())
                        .sum()
        ));

        return sb.toString();
    }

}
