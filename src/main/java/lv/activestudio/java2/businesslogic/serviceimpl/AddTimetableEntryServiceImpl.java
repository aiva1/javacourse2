package lv.activestudio.java2.businesslogic.serviceimpl;

import lv.activestudio.java2.businesslogic.serviceinterfaces.AddTimetableEntryService;
import lv.activestudio.java2.businesslogic.reqresp.add.AddTimetableEntryRequest;
import lv.activestudio.java2.businesslogic.reqresp.add.AddTimetableEntryResponse;
import lv.activestudio.java2.database.DAOInterfaces.TimetableEntryDAO;
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
        entry.setTeacherId(request.getRoomId());
        entry.setClassId(request.getClassId());
        entry.setDayOfWeek(request.getDatOfWeek());
        entry.setStartTime(request.getStartTime());
        entry.setEndTime(request.getEndTime());

        timetableEntryDAO.save(entry);
        Logger.getRootLogger().debug("Timetable Entry is saved to db via timetableEntryDAO");
        return new AddTimetableEntryResponse(true);
    }
}
