package lv.activestudio.java2.businesslogic.impl.list;

import lv.activestudio.java2.businesslogic.ListTrainingClassService;
import lv.activestudio.java2.businesslogic.api.list.ListTrainingClassesResponse;
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
