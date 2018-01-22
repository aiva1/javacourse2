package lv.activestudio.java2.businesslogic.impl.add;

import lv.activestudio.java2.businesslogic.AddTeacherService;
import lv.activestudio.java2.businesslogic.api.add.AddTeacherRequest;
import lv.activestudio.java2.businesslogic.api.add.AddTeacherResponse;
import lv.activestudio.java2.database.dao.TeacherDAO;
import lv.activestudio.java2.domain.Teacher;
import org.apache.log4j.Logger;

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
        Logger.getRootLogger().debug("New teacher is saved to db via DAO");
        return new AddTeacherResponse(true);
    }
}
