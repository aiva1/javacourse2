package lv.activestudio.java2.businesslogic;

import lv.activestudio.java2.businesslogic.api.add.AddClassRequest;
import lv.activestudio.java2.businesslogic.api.add.AddClassResponse;

public interface AddClassService {

    AddClassResponse addClass(AddClassRequest request);
}
