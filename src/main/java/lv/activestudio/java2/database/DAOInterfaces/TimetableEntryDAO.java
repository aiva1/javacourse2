package lv.activestudio.java2.database.DAOInterfaces;

import lv.activestudio.java2.domain.TimetableEntry;

import java.util.List;

public interface TimetableEntryDAO {

    TimetableEntry save(TimetableEntry entry);

    List<TimetableEntry> getAllByRoomId(Long roomId);

    List<TimetableEntry> getAllByClassId(Long classId);

    void delete(TimetableEntry timetableEntry);

    List<TimetableEntry> getAll();
}
