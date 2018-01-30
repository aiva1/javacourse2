package lv.activestudio.java2.businesslogic.reqresp.remove;

public class RemoveClassResponse {

    private boolean success;

    public RemoveClassResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}
