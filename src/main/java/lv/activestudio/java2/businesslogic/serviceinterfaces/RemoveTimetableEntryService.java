package lv.activestudio.java2.businesslogic.serviceinterfaces;

import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveTimetableEntryRequest;
import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveTimetableEntryResponse;

public interface RemoveTimetableEntryService {

    RemoveTimetableEntryResponse removeByClassRoomDay(RemoveTimetableEntryRequest request);

    RemoveTimetableEntryResponse removeByClassDayTime(RemoveTimetableEntryRequest request);
}
