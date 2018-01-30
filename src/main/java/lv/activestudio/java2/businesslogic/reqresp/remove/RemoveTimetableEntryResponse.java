package lv.activestudio.java2.businesslogic.reqresp.remove;

public class RemoveTimetableEntryResponse {

    private boolean success;

    public RemoveTimetableEntryResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}
