package lv.activestudio.java2.businesslogic.serviceimpl;

import lv.activestudio.java2.businesslogic.serviceinterfaces.RemoveTrainingClassService;
import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveClassRequest;
import lv.activestudio.java2.businesslogic.reqresp.remove.RemoveClassResponse;
import lv.activestudio.java2.database.DAOInterfaces.TrainingClassDAO;

public class RemoveTrainingClassServiceImpl implements RemoveTrainingClassService {

    private TrainingClassDAO tcDAO;

    public RemoveTrainingClassServiceImpl(TrainingClassDAO tcDAO) {
        this.tcDAO = tcDAO;
    }

    @Override
    public RemoveClassResponse removeByName(RemoveClassRequest request) {
        return new RemoveClassResponse(true);
    }
}
