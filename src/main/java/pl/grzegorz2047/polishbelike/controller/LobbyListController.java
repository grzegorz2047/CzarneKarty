package pl.grzegorz2047.polishbelike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.grzegorz2047.polishbelike.model.Player;
import pl.grzegorz2047.polishbelike.model.Room;

@Controller
public class LobbyListController {

    @RequestMapping("/lobbyList")
    public String serverListdisplay(@ModelAttribute("player") Player player, Model model) {
        model.addAttribute("room", new Room());
        model.addAttribute("player", player);
        return "lobbyList";
    }
}
