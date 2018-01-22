package lv.activestudio.java2.database.orm;

import lv.activestudio.java2.database.dao.TimetableEntryDAO;
import lv.activestudio.java2.domain.TimetableEntry;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class TimetableEntryDAOImpl implements TimetableEntryDAO {

    @Override
    public TimetableEntry save(TimetableEntry entry) {
        Logger.getRootLogger().debug("Save timetable entry to database");
        return entry;
    }

    @Override
    public List<TimetableEntry> getAllByRoomId(Long roomId) {
        Logger.getRootLogger().debug("Get all timetable entries by Room ID");
        return new ArrayList<>();
    }

    @Override
    public List<TimetableEntry> getAllByClassId(Long classId) {
        Logger.getRootLogger().debug("Get all timetable entries by Class ID");
        return new ArrayList<>();
    }

    @Override
    public void delete(TimetableEntry timetableEntry) {
        Logger.getRootLogger().debug("Remove all timetable entries");
    }

    @Override
    public List<TimetableEntry> getAll() {
        Logger.getRootLogger().debug("Get all timetable entries");
        return new ArrayList<>();
    }
}
