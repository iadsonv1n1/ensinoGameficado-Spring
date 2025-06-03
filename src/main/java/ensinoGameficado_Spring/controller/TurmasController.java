package ensinoGameficado_Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TurmasController {

    @RequestMapping("/")
    String index(){
        return "index";
    }
}
