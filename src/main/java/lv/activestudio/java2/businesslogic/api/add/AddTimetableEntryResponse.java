package lv.activestudio.java2.businesslogic.api.add;

public class AddTimetableEntryResponse {

    private boolean success;

    public AddTimetableEntryResponse(boolean isSuccess) {
        this.success = isSuccess;
    }

    public boolean isSuccess() {
        return success;
    }
}
