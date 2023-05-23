package learning.springboot.springbootannotations.config;

import learning.springboot.springbootannotations.controller.PizzaController;
import learning.springboot.springbootannotations.service.NonVegPizza;
import learning.springboot.springbootannotations.service.Pizza;
import learning.springboot.springbootannotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
//@Lazy
public class AppConfig {

        @Bean
//      @Lazy
        public Pizza vegPizza(){
            return new VegPizza();
        }

        @Bean
        public Pizza nonVegPizza(){
            return new NonVegPizza();
        }

        @Bean(initMethod = "init",destroyMethod = "destruct")
        public PizzaController pizzaController(){
            return  new PizzaController(nonVegPizza());
        }


}
