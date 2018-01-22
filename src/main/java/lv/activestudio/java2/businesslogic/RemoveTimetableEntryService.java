package lv.activestudio.java2.businesslogic;

import lv.activestudio.java2.businesslogic.api.remove.RemoveTimetableEntryRequest;
import lv.activestudio.java2.businesslogic.api.remove.RemoveTimetableEntryResponse;

public interface RemoveTimetableEntryService {

    RemoveTimetableEntryResponse removeByClassRoomDay(RemoveTimetableEntryRequest request);

    RemoveTimetableEntryResponse removeByClassDayTime(RemoveTimetableEntryRequest request);
}
