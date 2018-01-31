package lv.activestudio.java2.businesslogic.serviceimpl;

import lv.activestudio.java2.businesslogic.serviceinterfaces.ListTeacherService;
import lv.activestudio.java2.businesslogic.reqresp.list.ListTeacherResponse;
import lv.activestudio.java2.database.DAOInterfaces.TeacherDAO;

public class ListTeacherServiceImpl implements ListTeacherService {

    private TeacherDAO teacherDAO;

    @Override
    public ListTeacherResponse getTeachers() {
        return new ListTeacherResponse(teacherDAO.getAll());
    }
}
