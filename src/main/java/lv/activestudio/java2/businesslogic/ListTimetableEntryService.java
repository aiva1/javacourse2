package lv.activestudio.java2.businesslogic;

import lv.activestudio.java2.businesslogic.api.list.ListTimetableEntryResponse;

public interface ListTimetableEntryService {

    //TODO: add option to get list by Teacher Lastname
    //TODO: add option to get list by Room name

    ListTimetableEntryResponse getTimetableEntries();
}
