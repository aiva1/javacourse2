package lv.activestudio.java2.businesslogic.impl.list;

import lv.activestudio.java2.businesslogic.ListRoomService;
import lv.activestudio.java2.businesslogic.api.list.ListRoomResponse;
import lv.activestudio.java2.database.dao.RoomDAO;

public class ListRoomServiceImpl implements ListRoomService {

    private RoomDAO roomDAO;

    public ListRoomServiceImpl(RoomDAO roomDAO) {
        this.roomDAO = roomDAO;
    }

    @Override
    public ListRoomResponse getRooms() {
        return new ListRoomResponse(roomDAO.getAll());
    }
}
