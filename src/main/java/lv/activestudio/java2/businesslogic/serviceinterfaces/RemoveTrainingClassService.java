package lv.activestudio.java2.businesslogic.serviceinterfaces;

import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveClassRequest;
import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveClassResponse;

public interface RemoveTrainingClassService {

    RemoveClassResponse removeByName(RemoveClassRequest request);
}
