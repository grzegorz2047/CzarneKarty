package pl.grzegorz2047.polishbelike.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Room {

    @Getter
    private long id;
    @Getter
    @Setter
    private String name;
    @Getter
    private List<String> players;
    @Getter
    @Setter
    private String password;

    public void addPlayerToRoom(Player player) {
        if (player.getCurrentRoom() != null) {
            player.leaveRoom();
            player.enterRoom(this);

        }
    }

    public void removePlayerFromRoom(String name) {
        players.remove(name);
    }
}
