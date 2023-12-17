package hw11_spring.hw11;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasketController {
    BasketService basketService = new BasketService();
    @RequestMapping("/store/order/add")
    public String add(@RequestParam("id") List<Integer> id){
        basketService.add(id);
        return id.toString();
    }
    @RequestMapping("/store/order/get")
    public String get(){
        return basketService.get().toString();
//        return ("not founded");
    }
}
