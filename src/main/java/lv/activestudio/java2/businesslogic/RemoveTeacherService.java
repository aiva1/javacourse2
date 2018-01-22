package lv.activestudio.java2.businesslogic;

import lv.activestudio.java2.businesslogic.api.remove.RemoveTeacherRequest;
import lv.activestudio.java2.businesslogic.api.remove.RemoveTeacherResponse;

public interface RemoveTeacherService {

    RemoveTeacherResponse removeByLastname(RemoveTeacherRequest request);

}
