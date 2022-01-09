package pl.coderslab.SpringDay4.model;

import lombok.Data;
import lombok.Getter;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;


@Component
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@Data
public class Cart {

    private List<CartItem> cartItems = new ArrayList<>();

}
