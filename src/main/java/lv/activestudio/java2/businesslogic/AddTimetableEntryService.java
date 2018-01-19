package lv.activestudio.java2.businesslogic;

import lv.activestudio.java2.businesslogic.api.add.AddTimetableEntryRequest;
import lv.activestudio.java2.businesslogic.api.add.AddTimetableEntryResponse;

public interface AddTimetableEntryService {

    AddTimetableEntryResponse addTimetableEntry(AddTimetableEntryRequest request);
}
