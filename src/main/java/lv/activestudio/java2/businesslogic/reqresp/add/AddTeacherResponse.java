package lv.activestudio.java2.businesslogic.reqresp.add;

public class AddTeacherResponse {

    private boolean success;

    public AddTeacherResponse(boolean isSuccess) {
        this.success = isSuccess;
    }

    public boolean isSuccess() {
        return success;
    }
}
