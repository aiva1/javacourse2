package lv.activestudio.java2.businesslogic.serviceinterfaces;

import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveTeacherRequest;
import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveTeacherResponse;

public interface RemoveTeacherService {

    RemoveTeacherResponse removeByLastname(RemoveTeacherRequest request);

}
