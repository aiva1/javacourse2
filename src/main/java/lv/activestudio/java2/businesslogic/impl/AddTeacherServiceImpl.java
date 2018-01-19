package lv.activestudio.java2.businesslogic.impl;

import lv.activestudio.java2.businesslogic.AddTeacherService;
import lv.activestudio.java2.businesslogic.api.add.AddTeacherRequest;
import lv.activestudio.java2.businesslogic.api.add.AddTeacherResponse;
import lv.activestudio.java2.database.dao.TeacherDAO;
import lv.activestudio.java2.domain.Teacher;

public class AddTeacherServiceImpl implements AddTeacherService {

    private TeacherDAO teacherDAO;

    public AddTeacherServiceImpl(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    public AddTeacherResponse addTeacher(AddTeacherRequest request) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(request.getFirstName());
        teacher.setLastName(request.getLastName());
        teacher.setBio(request.getBio());
        teacherDAO.save(teacher);
        System.out.println("DEBUG: new teacher is saved to teacherDAO");
        return new AddTeacherResponse(true);
    }
}
