package pl.coderslab.SpringDay4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplyController {


    @GetMapping("/multiply")
    public String multiply(@RequestParam(defaultValue = "10") int size, Model model){
        model.addAttribute("rows",size);
        model.addAttribute("cols",size);

        return "multiply";

    }

    @GetMapping("/multiply/{rows:\\d+}/{cols:\\d+}")
    public String multiply(@PathVariable int rows,
                           @PathVariable int cols,
                           Model model){
        model.addAttribute("rows",rows);
        model.addAttribute("cols",cols);

        return "multiply";

    }
}
