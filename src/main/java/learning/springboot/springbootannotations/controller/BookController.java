package learning.springboot.springbootannotations.controller;

import learning.springboot.springbootannotations.beans.Book;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello-world")
//    @ResponseBody
    public String helloWorld(){
            return "Hello World!!";
    }


    @RequestMapping(
            value = {"/book","/core-java","java"},
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
//    @ResponseBody
    public Book getBook(){
        Book book = new Book(1,"Core Java","its core java");
        return book;
    }

}
