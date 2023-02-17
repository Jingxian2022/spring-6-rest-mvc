package guru.springframework.spring6restmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageCtr {

    @RequestMapping("/HomePage")
    public String ShowHomePage() {
        System.out.print("yes!");
        return "HomePage";
    }
}
