package lv.activestudio.java2.businesslogic.impl;

import lv.activestudio.java2.businesslogic.AddRoomService;
import lv.activestudio.java2.businesslogic.api.add.AddRoomRequest;
import lv.activestudio.java2.businesslogic.api.add.AddRoomResponse;
import lv.activestudio.java2.database.dao.RoomDAO;
import lv.activestudio.java2.domain.Room;

public class AddRoomServiceImpl implements AddRoomService {

    private RoomDAO roomDAO;

    public AddRoomServiceImpl(RoomDAO roomDAO) {
        this.roomDAO = roomDAO;
    }

    @Override
    public AddRoomResponse addRoom(AddRoomRequest request) {
        Room  room = new Room();
        room.setName(request.getName());
        room.setCapacity(request.getCapacity());
        room.setDescription(request.getDescription());
        roomDAO.save(room);

        System.out.println("DEBUG: room is saved to DAO");
        return new AddRoomResponse(true);
    }
}
