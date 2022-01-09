package pl.coderslab.SpringDay4.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;

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


    @GetMapping("/helloView")
    public String helloView(Model model){

        int hour = LocalTime.now().getHour();
//        hour=22;
//        hour=9;

        log.info("Godzina {}",hour);
        if(hour>=8 && hour<20){
            model.addAttribute("color","black");
            model.addAttribute("backgroundColor","white");
        } else {
            model.addAttribute("color","white");
            model.addAttribute("backgroundColor","black");
        }


        return "home";
    }

}
