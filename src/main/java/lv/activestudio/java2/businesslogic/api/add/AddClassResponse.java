package lv.activestudio.java2.businesslogic.api.add;

public class AddClassResponse {

    private boolean success;

    public AddClassResponse(boolean isSuccess) {
        this.success = isSuccess;
    }

    public boolean isSuccess() {
        return success;
    }
}
