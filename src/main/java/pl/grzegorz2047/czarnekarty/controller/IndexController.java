package pl.grzegorz2047.czarnekarty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.grzegorz2047.czarnekarty.model.Player;

@Controller

public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("player", new Player());
        return "index";
    }
}