package lv.activestudio.java2.businesslogic.api.add;

public class AddTeacherResponse {

    private boolean success;

    public AddTeacherResponse(boolean isSuccess) {
        this.success = isSuccess;
    }

    public boolean isSuccess() {
        return success;
    }
}
