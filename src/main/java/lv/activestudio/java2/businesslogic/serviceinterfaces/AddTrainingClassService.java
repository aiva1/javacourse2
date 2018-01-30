package lv.activestudio.java2.businesslogic.serviceinterfaces;

import lv.activestudio.java2.businesslogic.reqresp.add.AddTrainingClassRequest;
import lv.activestudio.java2.businesslogic.reqresp.add.AddTrainingClassResponse;

public interface AddTrainingClassService {

    AddTrainingClassResponse addClass(AddTrainingClassRequest request);
}
