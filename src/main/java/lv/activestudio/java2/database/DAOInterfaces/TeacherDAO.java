package lv.activestudio.java2.database.DAOInterfaces;

import lv.activestudio.java2.domain.Teacher;

import java.util.List;
import java.util.Optional;

/**
 * Defines the interface for accessing Teacher data (TEACHERS table)
 */
public interface TeacherDAO {

    Teacher save(Teacher teacher);

    Optional<Teacher> getById(Long id);

    Optional<Teacher> getByLastName(String lastName);

    void delete(Teacher teacher);

    List<Teacher> getAll();
}
