package learning.springboot.springbootannotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String hello(){
        return "hello repository";
    }
}
