package pl.coderslab.SpringDay4.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@Slf4j
//@RequestMapping("/first")
public class Main04 {

    @GetMapping("/form")
    public String getForm() {
        return "form";
    }


    @PostMapping("/form")
    @ResponseBody
    public String postForm(@RequestParam String name,
                           @RequestParam String date){
        LocalDate localDate = LocalDate.parse(date);

        log.info("Imię {}, data {}",name,localDate);
        return String.format("Hello %s, aktualna data %s",name,localDate);

    }
}
