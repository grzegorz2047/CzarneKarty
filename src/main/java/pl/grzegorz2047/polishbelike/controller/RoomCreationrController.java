package pl.grzegorz2047.polishbelike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.grzegorz2047.polishbelike.model.Player;
import pl.grzegorz2047.polishbelike.model.Room;

@Controller
public class RoomCreationrController {

    @PostMapping("/createLobby")
    public String playerSubmit(@ModelAttribute Room room) {
        return "playerLobby";
    }

}
