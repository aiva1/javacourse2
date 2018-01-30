package lv.activestudio.java2.businesslogic.serviceimpl;

import lv.activestudio.java2.businesslogic.serviceinterfaces.ListTrainingClassService;
import lv.activestudio.java2.businesslogic.reqresp.list.ListTrainingClassesResponse;
import lv.activestudio.java2.database.DAOInterfaces.TrainingClassDAO;

public class ListTrainingClassServiceImpl implements ListTrainingClassService {

    private TrainingClassDAO trainingClassDAO;

    public ListTrainingClassServiceImpl(TrainingClassDAO trainingClassDAO) {
        this.trainingClassDAO = trainingClassDAO;
    }

    @Override
    public ListTrainingClassesResponse getTrainingClasses() {
        return new ListTrainingClassesResponse(trainingClassDAO.getAll());
    }
}
