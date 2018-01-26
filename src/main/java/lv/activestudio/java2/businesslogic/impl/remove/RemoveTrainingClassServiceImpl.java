package lv.activestudio.java2.businesslogic.impl.remove;

import lv.activestudio.java2.businesslogic.RemoveTrainingClassService;
import lv.activestudio.java2.businesslogic.api.remove.RemoveClassRequest;
import lv.activestudio.java2.businesslogic.api.remove.RemoveClassResponse;
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
