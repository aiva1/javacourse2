package lv.activestudio.java2.businesslogic.reqresp.list;

import lv.activestudio.java2.domain.Teacher;

import java.util.List;

public class ListTeacherResponse {

    private List<Teacher> teachers;

    public ListTeacherResponse(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}

