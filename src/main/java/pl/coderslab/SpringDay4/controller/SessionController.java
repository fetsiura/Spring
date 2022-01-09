package pl.coderslab.SpringDay4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class SessionController {

    @GetMapping("/session")
    @ResponseBody
    public String session(HttpSession session){


        if(session.getAttribute("loginStart")!=null){
            return session.getAttribute("loginStart").toString();
        } else {
            return ""+ LocalDateTime.now();
        }
    }
}
