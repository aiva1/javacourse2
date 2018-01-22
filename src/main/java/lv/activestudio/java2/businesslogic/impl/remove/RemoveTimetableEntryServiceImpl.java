package lv.activestudio.java2.businesslogic.impl.remove;

import lv.activestudio.java2.businesslogic.RemoveTimetableEntryService;
import lv.activestudio.java2.businesslogic.api.remove.RemoveTimetableEntryRequest;
import lv.activestudio.java2.businesslogic.api.remove.RemoveTimetableEntryResponse;
import lv.activestudio.java2.database.dao.TimetableEntryDAO;

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
