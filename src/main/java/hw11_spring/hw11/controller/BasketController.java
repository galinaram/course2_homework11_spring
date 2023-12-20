package hw11_spring.hw11.controller;

import hw11_spring.hw11.service.BasketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @RequestMapping("/add")
    public String add(@RequestParam("id") List<Integer> id){
        basketService.add(id);
        return id.toString();
    }
    @RequestMapping("/get")
    public String get(){
        return basketService.get().toString();
//        return ("not founded");
    }
}
