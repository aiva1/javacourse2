package lv.activestudio.java2.businesslogic.serviceimpl;

import lv.activestudio.java2.businesslogic.serviceinterfaces.RemoveTimetableEntryService;
import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveTimetableEntryRequest;
import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveTimetableEntryResponse;
import lv.activestudio.java2.database.DAOInterfaces.TimetableEntryDAO;

public class RemoveTimetableEntryServiceImpl implements RemoveTimetableEntryService {

    private TimetableEntryDAO teDAO;

    public RemoveTimetableEntryServiceImpl(TimetableEntryDAO teDAO) {
        this.teDAO = teDAO;
    }

    @Override
    public RemoveTimetableEntryResponse removeByClassRoomDay(RemoveTimetableEntryRequest request) {
        return new RemoveTimetableEntryResponse(true);
    }

    @Override
    public RemoveTimetableEntryResponse removeByClassDayTime(RemoveTimetableEntryRequest request) {
        return new RemoveTimetableEntryResponse(true);
    }
}
