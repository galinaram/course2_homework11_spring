package hw11_spring.hw11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private List<Integer> id = new ArrayList<Integer>();
    public void setId(List<Integer> id){
        this.id = id;
    }
    public List<Integer> getId() {
        return id;
    }

}
