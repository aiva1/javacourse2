package lv.activestudio.java2.businesslogic.impl.add;

import lv.activestudio.java2.businesslogic.AddRoomService;
import lv.activestudio.java2.businesslogic.api.add.AddRoomRequest;
import lv.activestudio.java2.businesslogic.api.add.AddRoomResponse;
import lv.activestudio.java2.database.dao.RoomDAO;
import lv.activestudio.java2.domain.Room;
import org.apache.log4j.Logger;

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

        Logger.getRootLogger().debug("Room is saved to db via DAO");
        return new AddRoomResponse(true);
    }
}
