package learning.springboot.springbootannotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component

public class NonVegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "non veg pizza";
    }
}
