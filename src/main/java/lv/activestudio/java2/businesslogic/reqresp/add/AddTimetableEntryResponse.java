package lv.activestudio.java2.businesslogic.reqresp.add;

public class AddTimetableEntryResponse {

    private boolean success;

    public AddTimetableEntryResponse(boolean isSuccess) {
        this.success = isSuccess;
    }

    public boolean isSuccess() {
        return success;
    }
}
