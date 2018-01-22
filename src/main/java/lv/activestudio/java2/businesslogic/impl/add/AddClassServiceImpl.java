package lv.activestudio.java2.businesslogic.impl.add;

import lv.activestudio.java2.businesslogic.AddClassService;
import lv.activestudio.java2.businesslogic.api.add.AddClassRequest;
import lv.activestudio.java2.businesslogic.api.add.AddClassResponse;
import lv.activestudio.java2.database.dao.TrainingClassDAO;
import lv.activestudio.java2.domain.TrainingClass;
import org.apache.log4j.Logger;

public class AddClassServiceImpl implements AddClassService {

    TrainingClassDAO trainingClassDAO;

    public AddClassServiceImpl(TrainingClassDAO trainingClassDAO) {
        this.trainingClassDAO = trainingClassDAO;
    }

    @Override
    public AddClassResponse addClass(AddClassRequest request) {

        TrainingClass trainingClass = new TrainingClass();
        trainingClass.setName(request.getName());
        trainingClass.setDescription(request.getDescription());
        trainingClass.setTeacher(request.getTeacher());
        trainingClassDAO.save(trainingClass);
        Logger.getRootLogger().debug("Training class is stored to db via training class DAO");
        return new AddClassResponse(true);
    }
}
