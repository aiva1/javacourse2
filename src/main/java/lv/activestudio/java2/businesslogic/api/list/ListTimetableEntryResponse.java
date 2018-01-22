package lv.activestudio.java2.businesslogic.api.list;

import lv.activestudio.java2.domain.TimetableEntry;

import java.util.List;

public class ListTimetableEntryResponse {

    List<TimetableEntry> timetableEntries;

    public ListTimetableEntryResponse(List<TimetableEntry> timetableEntries) {
        this.timetableEntries = timetableEntries;
    }

    public List<TimetableEntry> getTimetableEntries() {
        return timetableEntries;
    }
}
