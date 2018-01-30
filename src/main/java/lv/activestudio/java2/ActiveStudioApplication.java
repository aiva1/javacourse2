package lv.activestudio.java2;

import lv.activestudio.java2.businesslogic.serviceimpl.AddTimetableEntryServiceImpl;
import lv.activestudio.java2.businesslogic.serviceimpl.AddTrainingClassServiceImpl;
import lv.activestudio.java2.businesslogic.serviceinterfaces.AddTimetableEntryService;
import lv.activestudio.java2.businesslogic.serviceinterfaces.AddTrainingClassService;
import lv.activestudio.java2.config.SpringAppConfig;
import lv.activestudio.java2.database.DAOInterfaces.TimetableEntryDAO;
import lv.activestudio.java2.database.DAOInterfaces.TrainingClassDAO;
import lv.activestudio.java2.database.hibernate.TimetableEntryDAOImpl;
import lv.activestudio.java2.database.hibernate.TrainingClassDAOImpl;
import lv.activestudio.java2.ui.View;
import lv.activestudio.java2.ui.impl.AddTeacherView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ActiveStudioApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfig.class);


        //TeacherDAO teacherDAO = new TeacherDAOImpl();
        TimetableEntryDAO timetableEntryDAO = new TimetableEntryDAOImpl();
        TrainingClassDAO trainingClassDAO = new TrainingClassDAOImpl();

        //AddTeacherService addTeacherService = new AddTeacherServiceImpl(teacherDAO);
        //ListTeacherService listTeacherService = new ListTeacherServiceImpl(teacherDAO);
        //RemoveTeacherService removeTeacherService = new RemoveTeacherServiceImpl(teacherDAO);

        AddTrainingClassService addTrainingClassService = new AddTrainingClassServiceImpl(trainingClassDAO);
        AddTimetableEntryService addTimetableEntryService = new AddTimetableEntryServiceImpl(timetableEntryDAO);

        Map<Integer, View> commands = new HashMap<>();
        commands.put(1, context.getBean(AddTeacherView.class));
        //commands.put(2, new ListTeacherView(listTeacherService));
        //commands.put(3, new RemoveTeacherView(removeTeacherService));

        while (true) {
            printProgramMenu();
            int menuItem = getFromUserMenuItemToExecute();
            if (menuItem == 99){
                break;
            }

            View view = commands.get(menuItem);
            view.execute();
        }
    }

    private static int getFromUserMenuItemToExecute() {
        System.out.print("Please enter menu item number to execute:");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    private static void printProgramMenu() {
        System.out.println("Program menu:");
        System.out.println("1. Add new teacher");
        System.out.println("2. List all teachers");
        /*System.out.println("5. Add new class");
        System.out.println("6. List all classes");
        System.out.println("7. Add new class");
        System.out.println("8. List all classes");
        System.out.println("9. Create new timetable entry");
        System.out.println("10. List timetable for Say (1-7)");
        System.out.println("11. Remove timetable entry (classname, roomname)");
        System.out.println("12. Remove class (classname)");*/
        System.out.println("3. Remove teacher (lastname)");
        System.out.println("99. Exit");


    }
}
