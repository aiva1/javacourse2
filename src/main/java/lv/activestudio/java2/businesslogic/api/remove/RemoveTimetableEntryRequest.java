package lv.activestudio.java2.businesslogic.api.remove;

public class RemoveTimetableEntryRequest {

    private String calssName;
    private String roomName;
    private int dayOdTheWeek;

    public RemoveTimetableEntryRequest(String calssName, String roomName, int dayOdTheWeek) {
        this.calssName = calssName;
        this.roomName = roomName;
        this.dayOdTheWeek = dayOdTheWeek;
    }

    public String getCalssName() {
        return calssName;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getDayOdTheWeek() {
        return dayOdTheWeek;
    }
}
