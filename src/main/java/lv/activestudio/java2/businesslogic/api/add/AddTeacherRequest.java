package lv.activestudio.java2.businesslogic.api.add;

public class AddTeacherRequest {

    private String firstName;
    private String lastName;
    private String bio;

    public AddTeacherRequest(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBio() {
        return bio;
    }
}
