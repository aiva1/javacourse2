package lv.activestudio.java2.database.jdbc;

import lv.activestudio.java2.database.dao.TeacherDAO;
import lv.activestudio.java2.domain.Teacher;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeacherDAOImpl implements TeacherDAO {

    @Override
    public Teacher save(Teacher teacher) {
        Logger.getRootLogger().debug("Save teacher to database");
        return teacher;
    }

    @Override
    public Optional<Teacher> getById(Long id) {
        Logger.getRootLogger().debug("Get teacher by ID");
        return Optional.empty();
    }

    @Override
    public Optional<Teacher> getByLastName(String lastName) {
        Logger.getRootLogger().debug("Get teacher by LastName");
        return Optional.empty();
    }

    @Override
    public void delete(Teacher teacher) {
        Logger.getRootLogger().debug("Remove teacher from database");
    }

    @Override
    public List<Teacher> getAll() {
        Logger.getRootLogger().debug("Retrieve all teachers from database");
        return new ArrayList<>();
    }
}
