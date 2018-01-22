package lv.activestudio.java2.businesslogic.api.list;

import lv.activestudio.java2.domain.Room;

import java.util.List;

public class ListRoomResponse {

    private List<Room> rooms;

    public ListRoomResponse(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
