package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("oracle")
    public String printGreetings(){
        return "hi oracle!!";
    }

    @GetMapping()
    public String print(){
        return "hi guest";
    }
}
