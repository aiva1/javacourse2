package lv.activestudio.java2.database.orm;

import lv.activestudio.java2.database.dao.RoomDAO;
import lv.activestudio.java2.domain.Room;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RoomDAOImpl implements RoomDAO {

    @Override
    public Room save(Room room) {
        Logger.getRootLogger().debug("Save room to database");
        return room;
    }

    @Override
    public Optional<Room> getById(Long id) {
        Logger.getRootLogger().debug("Get room by ID");
        return Optional.empty();
    }

    @Override
    public Optional<Room> getByName(String name) {
        Logger.getRootLogger().debug("Get room by Name");
        return Optional.empty();
    }

    @Override
    public void delete(Room room) {
        Logger.getRootLogger().debug("Delete room from database");
    }

    @Override
    public List<Room> getAll() {
        Logger.getRootLogger().debug("Retrieve all rooms from database");
        return new ArrayList<Room>();
    }
}
