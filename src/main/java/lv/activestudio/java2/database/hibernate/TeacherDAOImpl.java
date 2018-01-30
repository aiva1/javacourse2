package lv.activestudio.java2.database.hibernate;

import lv.activestudio.java2.database.DAOInterfaces.TeacherDAO;
import lv.activestudio.java2.domain.Teacher;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Implements the interface for accessing Teacher data (TEACHERS table)
 */
//@Component("teacherDAOImpl")
@Repository("teacherDAOImpl")
@Transactional
public class TeacherDAOImpl implements TeacherDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Teacher save(Teacher teacher) {
        Logger.getRootLogger().debug("Save teacher to database");
        getCurrSession().persist(teacher);
        return teacher;
    }

    @Override
    public Optional<Teacher> getById(Long id) {
        Logger.getRootLogger().debug("Get teacher by ID");
        Teacher teacher = (Teacher) getCurrSession().get(Teacher.class, id);
        return Optional.ofNullable(teacher);
    }

    @Override
    public Optional<Teacher> getByLastName(String lastName) {
        Logger.getRootLogger().debug("Get teacher by ID");
        Teacher teacher = (Teacher) getCurrSession().get(Teacher.class, lastName);
        return Optional.ofNullable(teacher);
    }

    @Override
    public void delete(Teacher teacher) {
        Logger.getRootLogger().debug("Remove teacher from database");
        getCurrSession().delete(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        Logger.getRootLogger().debug("Retrieve all teachers from database");

        //return new ArrayList<Teacher>();
        return getCurrSession()
                .createCriteria(Teacher.class)
                .list();
    }

    private Session getCurrSession() {
        Session session;

        try {
           session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

        return session;
    }
}
