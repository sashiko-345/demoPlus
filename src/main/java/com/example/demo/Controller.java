package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping("/hello")
public class Controller {
    //@Autowired
    //StuDao studao;
    @RequestMapping("/qq")
    public String gg(){
        //return studao.findById(1);
        return "jsh";
    }
}*/

@RestController
@RequestMapping("/hello")
public class Controller {
    @Autowired
    StuDao studao;
    @RequestMapping("/mm")
    public int mm(){
        return 234;
    }
}