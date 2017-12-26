package pl.grzegorz2047.polishbelike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.grzegorz2047.polishbelike.model.Player;

@Controller

public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("player", new Player());
        return "index";
    }
}