package lv.activestudio.java2.businesslogic.reqresp.add;

public class AddTrainingClassResponse {

    private boolean success;

    public AddTrainingClassResponse(boolean isSuccess) {
        this.success = isSuccess;
    }

    public boolean isSuccess() {
        return success;
    }
}
