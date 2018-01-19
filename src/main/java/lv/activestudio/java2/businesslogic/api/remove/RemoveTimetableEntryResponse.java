package lv.activestudio.java2.businesslogic.api.remove;

public class RemoveTimetableEntryResponse {

    private boolean success;

    public RemoveTimetableEntryResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}
