package lv.activestudio.java2.database.dao;

import lv.activestudio.java2.domain.TrainingClass;

import java.util.List;
import java.util.Optional;

public interface TrainingClassDAO {

   TrainingClass save(TrainingClass classToSave);

   Optional<TrainingClass> getById(Long id);

   Optional<TrainingClass> getByName(String name);

   void delete(TrainingClass trainingClass);

   List<TrainingClass> getAll();



}
