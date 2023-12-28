package com.generatiaTech.controller;

import com.generatiaTech.repository.UserRepository;
import org.ariia.mvc.annotation.PathVariable;
import org.ariia.mvc.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class OrderController {

    private final UserRepository userRepository; // Presupunând existența unui repository pentru User

    public OrderController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users/{username}/orders")
    public List<com.zegasoftware.Order> getUserOrders(@PathVariable String username) {
        com.zegasoftware.User user = userRepository.findByUsername(username);
        if (user != null) {
            return user.getOrderHistory();
        } else {
            // Tratează cazul în care utilizatorul nu există
            return null;
        }
    }
}
