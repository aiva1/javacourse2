package lv.activestudio.java2.businesslogic;

import lv.activestudio.java2.businesslogic.api.remove.RemoveClassRequest;
import lv.activestudio.java2.businesslogic.api.remove.RemoveClassResponse;

public interface RemoveTrainingClassService {

    RemoveClassResponse removeByName(RemoveClassRequest request);
}
