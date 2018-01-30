package lv.activestudio.java2.businesslogic.reqresp.remove;

public class RemoveTeacherResponse {

    private boolean succedd;

    public RemoveTeacherResponse(boolean succedd) {
        this.succedd = succedd;
    }

    public boolean isSuccedd() {
        return succedd;
    }
}
