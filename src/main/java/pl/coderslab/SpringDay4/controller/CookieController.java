package pl.coderslab.SpringDay4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {


    @GetMapping("/setCookie/{value1}/{value2}")
    @ResponseBody
    public String setCookie(@PathVariable String value1,
                            @PathVariable String value2,
                            HttpServletResponse response){

        Cookie cookie1 = new Cookie("cookie1",value1);
        Cookie cookie2 = new Cookie("cookie2",value2);

        cookie1.setPath("/");
        cookie2.setPath("/");
        response.addCookie(cookie1);
        response.addCookie(cookie2);


        return "cookies added";

    }

    @GetMapping("/getCookies")
    @ResponseBody
    public String getCookies(HttpServletRequest request){

        String cookie1 = WebUtils.getCookie(request,"cookie1").getValue();
        String cookie2 = WebUtils.getCookie(request,"cookie2").getValue();

        return String.format("Cookie 1 = %s, cookie 2 = %s",cookie1,cookie2);

    }
}
