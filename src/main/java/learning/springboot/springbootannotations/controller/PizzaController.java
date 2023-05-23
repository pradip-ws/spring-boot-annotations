package learning.springboot.springbootannotations.controller;

import learning.springboot.springbootannotations.service.Pizza;
import learning.springboot.springbootannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Component("pizzaDemo") to give specific bean name
//by degauly spring container give spring bean name as class name(first letter lowercase)
public class PizzaController {
//    @Autowired // feild injection
//    private VegPizza vegPizza;
//    @Qualifier("vegPizza")

    private Pizza pizza;

//    @Autowired   //construction injection
    public PizzaController(Pizza pizza){
        this.pizza = pizza;
    }

//    @Autowired setter injection
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizza(){
        return pizza.getPizza();
    }

    public  void init(){
        System.out.println("initialization logic");
    }

    public void destruct(){
        System.out.println("descrution logic");
    }
}
