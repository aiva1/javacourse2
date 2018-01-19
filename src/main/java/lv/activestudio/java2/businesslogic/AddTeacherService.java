package lv.activestudio.java2.businesslogic;

import lv.activestudio.java2.businesslogic.api.add.AddTeacherRequest;
import lv.activestudio.java2.businesslogic.api.add.AddTeacherResponse;

public interface AddTeacherService {

    AddTeacherResponse addTeacher(AddTeacherRequest request);
}
