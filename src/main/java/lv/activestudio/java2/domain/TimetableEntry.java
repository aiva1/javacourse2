package lv.activestudio.java2.domain;

import java.time.LocalTime;

public class TimetableEntry {

    private Long classId; //TODO: TrainingClass Object?
    private Long roomId;  //TODO: Room Object?
    private int datOfWeek; //TODO: try using ChoiceFormat to format the day of the week
    private LocalTime startTime;
    private LocalTime endTime;

    @Override
    public String toString() {
        return "TimetableEntry{" +
                "classId=" + classId +
                ", roomId=" + roomId +
                ", datOfWeek=" + datOfWeek +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    //TODO: consider overriding hashCode and equals

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public void setDatOfWeek(int datOfWeek) {
        this.datOfWeek = datOfWeek;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
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
