package hw11_spring.hw11.service;

import hw11_spring.hw11.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void add (List<Integer> id){
        basket.getId().addAll(id);
    }
    public List<Integer> get(){
        return basket.getId();
    }
}
