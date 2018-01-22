package lv.activestudio.java2.businesslogic;

import lv.activestudio.java2.businesslogic.api.add.AddTrainingClassRequest;
import lv.activestudio.java2.businesslogic.api.add.AddTrainingClassResponse;

public interface AddTrainingClassService {

    AddTrainingClassResponse addClass(AddTrainingClassRequest request);
}
