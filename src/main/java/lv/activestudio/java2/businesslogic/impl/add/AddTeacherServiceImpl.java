package lv.activestudio.java2.businesslogic.impl.add;

import lv.activestudio.java2.businesslogic.AddTeacherService;
import lv.activestudio.java2.businesslogic.api.add.AddTeacherRequest;
import lv.activestudio.java2.businesslogic.api.add.AddTeacherResponse;
import lv.activestudio.java2.database.DAOInterfaces.TeacherDAO;
import lv.activestudio.java2.domain.Teacher;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class AddTeacherServiceImpl implements AddTeacherService {

    @Autowired
    @Qualifier("teacherDAOImpl")
    private TeacherDAO teacherDAO;

    @Override
    //@Transactional(Transactional.TxType.REQUIRES_NEW)
    public AddTeacherResponse addTeacher(AddTeacherRequest request) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(request.getFirstName());
        teacher.setLastName(request.getLastName());
        teacher.setBio(request.getBio());
        teacher.setPhoto(request.getPhoto());
        teacherDAO.save(teacher);
        return new AddTeacherResponse(true);
    }
}
