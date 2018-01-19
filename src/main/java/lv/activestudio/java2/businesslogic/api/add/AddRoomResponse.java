package lv.activestudio.java2.businesslogic.api.add;

public class AddRoomResponse {

    private boolean success;

    public AddRoomResponse(boolean isSuccess) {
        this.success = isSuccess;
    }

    public boolean isSuccess() {
        return success;
    }
}
