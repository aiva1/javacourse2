package lv.activestudio.java2.businesslogic.impl.remove;

import lv.activestudio.java2.businesslogic.RemoveTeacherService;
import lv.activestudio.java2.businesslogic.api.remove.RemoveTeacherRequest;
import lv.activestudio.java2.businesslogic.api.remove.RemoveTeacherResponse;
import lv.activestudio.java2.database.dao.TeacherDAO;

public class RemoveTeacherServiceImpl implements RemoveTeacherService {

    private TeacherDAO teacherDAO;

    public RemoveTeacherServiceImpl(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    public RemoveTeacherResponse removeByLastname(RemoveTeacherRequest request) {
        return new RemoveTeacherResponse(true);
    }
}
