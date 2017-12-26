package pl.grzegorz2047.czarnekarty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.grzegorz2047.czarnekarty.model.Player;
import pl.grzegorz2047.czarnekarty.model.Room;

@Controller
public class InGameRoomController {
    @RequestMapping("/inGameRoom")
    public String serverListdisplay(Model model) {
        return "inGameRoom";
    }

}
