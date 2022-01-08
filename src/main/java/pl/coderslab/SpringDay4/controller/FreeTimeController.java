package pl.coderslab.SpringDay4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class FreeTimeController {


    @GetMapping("/freetime")
    @ResponseBody
    public String freeTime(){

        LocalDateTime date = LocalDateTime.now();

        if(date.getDayOfWeek().toString().equals("SATURDAY") || date.getDayOfWeek().toString().equals("SUNDAY")){
            return "Wolne";
        }

        if(date.getHour() >8 && date.getHour()<18){
            return "Pracuję nie dzwoń";
        } else {
            return "Po pracy";
        }
    }
}
