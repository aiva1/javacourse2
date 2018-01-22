package lv.activestudio.java2.businesslogic.impl.add;

import lv.activestudio.java2.businesslogic.AddTimetableEntryService;
import lv.activestudio.java2.businesslogic.api.add.AddTimetableEntryRequest;
import lv.activestudio.java2.businesslogic.api.add.AddTimetableEntryResponse;
import lv.activestudio.java2.database.dao.TimetableEntryDAO;
import lv.activestudio.java2.domain.TimetableEntry;
import org.apache.log4j.Logger;

public class AddTimetableEntryServiceImpl implements AddTimetableEntryService {

    TimetableEntryDAO timetableEntryDAO;

    public AddTimetableEntryServiceImpl(TimetableEntryDAO timetableEntryDAO) {
        this.timetableEntryDAO = timetableEntryDAO;
    }

    @Override
    public AddTimetableEntryResponse addTimetableEntry(AddTimetableEntryRequest request) {
        TimetableEntry entry = new TimetableEntry();
        entry.setRoomId(request.getRoomId());
        entry.setClassId(request.getClassId());
        entry.setDatOfWeek(request.getDatOfWeek());
        entry.setStartTime(request.getStartTime());
        entry.setEndTime(request.getEndTime());

        timetableEntryDAO.save(entry);
        Logger.getRootLogger().debug("Timetable Entry is saved to db via teDAO");
        return new AddTimetableEntryResponse(true);
    }
}
