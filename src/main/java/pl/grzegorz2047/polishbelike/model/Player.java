package pl.grzegorz2047.polishbelike.model;

import lombok.Getter;
import lombok.Setter;

public class Player {

    @Getter
    private long id;
    @Getter
    @Setter
    private String name;
    @Getter
    private Room currentRoom;

    public void leaveRoom() {
        currentRoom.removePlayerFromRoom(this.name);
    }

    public void enterRoom(Room room) {
        this.currentRoom = room;
    }
}
