package lv.activestudio.java2.businesslogic.serviceimpl;

import lv.activestudio.java2.businesslogic.serviceinterfaces.ListTimetableEntryService;
import lv.activestudio.java2.businesslogic.reqresp.list.ListTimetableEntryResponse;
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
