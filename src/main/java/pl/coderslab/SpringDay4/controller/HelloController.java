package pl.coderslab.SpringDay4.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class HelloController {


    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld(){

        log.debug("Leci hello");

        return "Hello body ";
    }




    @GetMapping(value = "/hello/{name}/{surname}",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String helloName(@PathVariable String name,
                            @PathVariable String surname){
        log.debug("Podana info {} {}",name,surname);
        return String.format("Witaj %s %s",name,surname);
    }

}
