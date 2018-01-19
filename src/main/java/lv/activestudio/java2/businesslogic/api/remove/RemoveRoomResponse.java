package lv.activestudio.java2.businesslogic.api.remove;

public class RemoveRoomResponse {

    private boolean success;

    public RemoveRoomResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}
