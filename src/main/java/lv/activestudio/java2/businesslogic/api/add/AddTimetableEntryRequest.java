package lv.activestudio.java2.businesslogic.api.add;

import java.time.LocalTime;

public class AddTimetableEntryRequest {

    private Long classId;
    private Long roomId;
    private int datOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public AddTimetableEntryRequest(Long classId, Long roomId, int datOfWeek, LocalTime startTime, LocalTime endTime) {
        this.classId = classId;
        this.roomId = roomId;
        this.datOfWeek = datOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getClassId() {
        return classId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public int getDatOfWeek() {
        return datOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
