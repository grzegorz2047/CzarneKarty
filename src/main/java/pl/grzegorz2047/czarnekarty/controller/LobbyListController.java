package pl.grzegorz2047.czarnekarty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.grzegorz2047.czarnekarty.model.Player;
import pl.grzegorz2047.czarnekarty.model.Room;

@Controller
public class LobbyListController {

    @RequestMapping("/lobbyList")
    public String serverListdisplay(@ModelAttribute("player") Player player, Model model) {
        model.addAttribute("room", new Room());
        model.addAttribute("player", player);
        return "lobbyList";
    }
}
