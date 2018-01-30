package lv.activestudio.java2.businesslogic.serviceimpl;

import lv.activestudio.java2.businesslogic.serviceinterfaces.RemoveTeacherService;
import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveTeacherRequest;
import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveTeacherResponse;
import lv.activestudio.java2.database.DAOInterfaces.TeacherDAO;

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
