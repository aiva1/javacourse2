package lv.activestudio.java2.database.dao;

import lv.activestudio.java2.domain.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherDAO {

    Teacher save(Teacher teacher);

    Optional<Teacher> getById(Long id);

    Optional<Teacher> getByLastName(String lastName);

    void delete(Teacher teacher);

    List<Teacher> getAll();
}
