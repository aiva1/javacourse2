package lv.activestudio.java2.businesslogic.serviceinterfaces;

import lv.activestudio.java2.businesslogic.reqresp.add.AddTeacherRequest;
import lv.activestudio.java2.businesslogic.reqresp.add.AddTeacherResponse;

public interface AddTeacherService {

    AddTeacherResponse addTeacher(AddTeacherRequest request);
}
