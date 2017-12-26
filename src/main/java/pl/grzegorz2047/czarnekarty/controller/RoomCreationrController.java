package pl.grzegorz2047.czarnekarty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.grzegorz2047.czarnekarty.model.Room;

@Controller
public class RoomCreationrController {

    @PostMapping("/createLobby")
    public String playerSubmit(@ModelAttribute Room room) {
        return "playerLobby";
    }

}
