package learning.springboot.springbootannotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class VegPizza implements Pizza{
    @Override
    public String getPizza(){
        return "veg pizza";
    }
}
