package pl.coderslab.SpringDay4.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@Slf4j
public class RandomController {

    @GetMapping("/show-random")
    @ResponseBody
    public String showRandom(){
        Random random = new Random();
        return   "Wylosowana liczba: "+random.nextInt(101);
    }


    @GetMapping(value = "/random/{max:\\d+}", produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String randomMax(@PathVariable int max){
        Random random= new Random();
        log.debug("losuję liczbę do max {}",max);

        return String.format("Użytkownik podał wartość %d, wylosowano liczbę %d",max,random.nextInt(max));
    }

    @GetMapping(value = "/random/{min:\\d+}/{max:\\d+}", produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String randomMinMax(@PathVariable int min,@PathVariable int max){
        int random = min + (int) (Math.random() * (max - min));


        log.debug("losuję liczbę od min {} do max {}",min,max);

        return String.format("Użytkownik podał wartość min %d oraz max %d, wylosowano liczbę %d",min,max,random);
    }
}
