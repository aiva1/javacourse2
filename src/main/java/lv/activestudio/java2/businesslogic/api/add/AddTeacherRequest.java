package lv.activestudio.java2.businesslogic.api.add;

public class AddTeacherRequest {

    private String firstName;
    private String lastName;
    private String bio;
    private String photo;

    public AddTeacherRequest(String firstName, String lastName, String bio, String photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.photo = photo;
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

    public String getPhoto() {
        return photo;
    }
}
