package learning.springboot.springbootannotations.lazy;

import org.springframework.stereotype.Component;

@Component
public class EagarLoader {
    public EagarLoader(){
        System.out.println("EagarLoader....");
    }
}
