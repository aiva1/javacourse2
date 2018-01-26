package lv.activestudio.java2.businesslogic.impl.list;

import lv.activestudio.java2.businesslogic.ListTeacherService;
import lv.activestudio.java2.businesslogic.api.list.ListTeacherResponse;
import lv.activestudio.java2.database.DAOInterfaces.TeacherDAO;

public class ListTeacherServiceImpl implements ListTeacherService {

    private TeacherDAO teacherDAO;

    public ListTeacherServiceImpl(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    public ListTeacherResponse getTeachers() {
        return new ListTeacherResponse(teacherDAO.getAll());
    }
}
