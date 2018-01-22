package lv.activestudio.java2.businesslogic.impl.remove;

import lv.activestudio.java2.businesslogic.RemoveRoomService;
import lv.activestudio.java2.businesslogic.api.remove.RemoveRoomRequest;
import lv.activestudio.java2.businesslogic.api.remove.RemoveRoomResponse;
import lv.activestudio.java2.database.dao.RoomDAO;

public class RemoveRoomServiceImpl implements RemoveRoomService {

    private RoomDAO roomDAO;

    public RemoveRoomServiceImpl(RoomDAO roomDAO) {
        this.roomDAO = roomDAO;
    }

    @Override
    public RemoveRoomResponse removeByName(RemoveRoomRequest request) {
        return new RemoveRoomResponse(true);
    }
}
