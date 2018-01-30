package lv.activestudio.java2.businesslogic.serviceimpl;

import lv.activestudio.java2.businesslogic.serviceinterfaces.AddTrainingClassService;
import lv.activestudio.java2.businesslogic.reqresp.add.AddTrainingClassRequest;
import lv.activestudio.java2.businesslogic.reqresp.add.AddTrainingClassResponse;
import lv.activestudio.java2.database.DAOInterfaces.TrainingClassDAO;
import lv.activestudio.java2.domain.TrainingClass;
import org.apache.log4j.Logger;

public class AddTrainingClassServiceImpl implements AddTrainingClassService {

    TrainingClassDAO trainingClassDAO;

    public AddTrainingClassServiceImpl(TrainingClassDAO trainingClassDAO) {
        this.trainingClassDAO = trainingClassDAO;
    }

    @Override
    public AddTrainingClassResponse addClass(AddTrainingClassRequest request) {

        TrainingClass trainingClass = new TrainingClass();
        trainingClass.setTitle(request.getName());
        trainingClass.setDescription(request.getDescription());
        trainingClassDAO.save(trainingClass);
        Logger.getRootLogger().debug("Training class is stored to db via training class DAO");
        return new AddTrainingClassResponse(true);
    }
}
