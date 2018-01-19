package lv.activestudio.java2.businesslogic.api.remove;

public class RemoveTeacherRequest {

    private String lastName;

    public RemoveTeacherRequest(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
