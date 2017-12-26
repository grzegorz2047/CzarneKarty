package pl.grzegorz2047.czarnekarty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.grzegorz2047.czarnekarty.model.Player;

@Controller
public class PlayerController {

    @PostMapping("/addPlayer")
    public String playerSubmit(RedirectAttributes attributes, @ModelAttribute Player player) {
        attributes.addAttribute("player", player);
        return "redirect:lobbyList";
    }

}
