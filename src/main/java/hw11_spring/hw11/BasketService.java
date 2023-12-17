package hw11_spring.hw11;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    Basket basket = new Basket();
    public void add (List<Integer> id){
        basket.getId().addAll(id);
    }
    public List<Integer> get(){
        return basket.getId();
    }
}
