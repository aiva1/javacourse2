package lv.activestudio.java2.businesslogic.impl.list;

import lv.activestudio.java2.businesslogic.ListTimetableEntryService;
import lv.activestudio.java2.businesslogic.api.list.ListTimetableEntryResponse;
import lv.activestudio.java2.database.DAOInterfaces.TimetableEntryDAO;

public class ListTimetableEntryServiceImpl implements ListTimetableEntryService {

    private TimetableEntryDAO timetableEntryDAO;

    public ListTimetableEntryServiceImpl(TimetableEntryDAO timetableEntryDAO) {
        this.timetableEntryDAO = timetableEntryDAO;
    }

    @Override
    public ListTimetableEntryResponse getTimetableEntries() {
        return new ListTimetableEntryResponse(timetableEntryDAO.getAll());
    }
}
