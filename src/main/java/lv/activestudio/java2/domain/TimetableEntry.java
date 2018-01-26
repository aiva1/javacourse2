package lv.activestudio.java2.domain;

import java.time.LocalTime;

public class TimetableEntry {

    private long entryId;
    private long classId;
    private long teacherId;
    private int dayOfWeek; //TODO: try using ChoiceFormat to format the day of the week
    private LocalTime startTime;
    private LocalTime endTime;

    @Override
    public String toString() {
        return "TimetableEntry{" +
                "entryId=" + entryId +
                ", classId=" + classId +
                ", teacherId=" + teacherId +
                ", dayOfWeek=" + dayOfWeek +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public long getEntryId() {
        return entryId;
    }

    public void setEntryId(long entryId) {
        this.entryId = entryId;
    }

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
