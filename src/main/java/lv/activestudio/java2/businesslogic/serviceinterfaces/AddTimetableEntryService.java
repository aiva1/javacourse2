package lv.activestudio.java2.businesslogic.serviceinterfaces;

import lv.activestudio.java2.businesslogic.reqresp.add.AddTimetableEntryRequest;
import lv.activestudio.java2.businesslogic.reqresp.add.AddTimetableEntryResponse;

public interface AddTimetableEntryService {

    AddTimetableEntryResponse addTimetableEntry(AddTimetableEntryRequest request);
}
