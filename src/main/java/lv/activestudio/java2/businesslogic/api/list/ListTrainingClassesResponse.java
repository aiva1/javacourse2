package lv.activestudio.java2.businesslogic.api.list;

import lv.activestudio.java2.domain.TrainingClass;

import java.util.List;

public class ListTrainingClassesResponse {

    private List<TrainingClass> trainingClasses;

    public ListTrainingClassesResponse(List<TrainingClass> trainingClasses) {
        this.trainingClasses = trainingClasses;
    }

    public List<TrainingClass> getTrainingClasses() {
        return trainingClasses;
    }
}
