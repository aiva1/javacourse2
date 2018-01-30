package lv.activestudio.java2.businesslogic.serviceinterfaces;

import lv.activestudio.java2.businesslogic.reqresp.list.ListTimetableEntryResponse;

public interface ListTimetableEntryService {

    //TODO: add option to get list by Teacher Lastname
    //TODO: add option to get list by Room name

    ListTimetableEntryResponse getTimetableEntries();
}
