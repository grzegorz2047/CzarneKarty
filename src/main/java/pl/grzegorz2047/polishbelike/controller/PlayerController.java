package pl.grzegorz2047.polishbelike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.grzegorz2047.polishbelike.model.Player;

@Controller
public class PlayerController {

    @PostMapping("/addPlayer")
    public String playerSubmit(RedirectAttributes attributes, @ModelAttribute Player player) {
        attributes.addAttribute("player", player);
        return "redirect:lobbyList";
    }

}
