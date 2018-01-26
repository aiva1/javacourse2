package lv.activestudio.java2.database.hibernate;

import lv.activestudio.java2.database.DAOInterfaces.TrainingClassDAO;
import lv.activestudio.java2.domain.TrainingClass;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainingClassDAOImpl implements TrainingClassDAO {

    @Override
    public TrainingClass save(TrainingClass classToSave) {
        Logger.getRootLogger().debug("Save training class to database");
        return classToSave;
    }

    @Override
    public Optional<TrainingClass> getById(Long id) {
        Logger.getRootLogger().debug("Get training class by ID");
        return Optional.empty();
    }

    @Override
    public Optional<TrainingClass> getByName(String name) {
        Logger.getRootLogger().debug("Get training class by Name");
        return Optional.empty();
    }

    @Override
    public void delete(TrainingClass trainingClass) {
        Logger.getRootLogger().debug("Delete all training classes from database");
    }

    @Override
    public List<TrainingClass> getAll() {
        Logger.getRootLogger().debug("Get all training classes from database");
        return new ArrayList<>();
    }
}
