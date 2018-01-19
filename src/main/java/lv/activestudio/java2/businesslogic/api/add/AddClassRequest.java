package lv.activestudio.java2.businesslogic.api.add;

import lv.activestudio.java2.domain.Teacher;

public class AddClassRequest {

    private String name;
    private String description;
    private Teacher teacher; //TODO: change to String firstName, String lastName ?

    public AddClassRequest(String name, String description, Teacher teacher) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
