package ensinoGameficado_Spring.controller;

import ensinoGameficado_Spring.model.Turma;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TurmasController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
