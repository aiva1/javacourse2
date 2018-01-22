package lv.activestudio.java2;

import lv.activestudio.java2.businesslogic.*;
import lv.activestudio.java2.businesslogic.impl.add.AddTimetableEntryServiceImpl;
import lv.activestudio.java2.businesslogic.impl.add.AddTrainingClassServiceImpl;
import lv.activestudio.java2.businesslogic.impl.add.AddRoomServiceImpl;
import lv.activestudio.java2.businesslogic.impl.add.AddTeacherServiceImpl;
import lv.activestudio.java2.businesslogic.impl.list.ListRoomServiceImpl;
import lv.activestudio.java2.businesslogic.impl.remove.RemoveRoomServiceImpl;
import lv.activestudio.java2.database.dao.RoomDAO;
import lv.activestudio.java2.database.dao.TeacherDAO;
import lv.activestudio.java2.database.dao.TimetableEntryDAO;
import lv.activestudio.java2.database.dao.TrainingClassDAO;
import lv.activestudio.java2.database.orm.RoomDAOImpl;
import lv.activestudio.java2.database.orm.TeacherDAOImpl;
import lv.activestudio.java2.database.orm.TimetableEntryDAOImpl;
import lv.activestudio.java2.database.orm.TrainingClassDAOImpl;
import lv.activestudio.java2.ui.View;
import lv.activestudio.java2.ui.impl.AddRoomView;
import lv.activestudio.java2.ui.impl.AddTeacherView;
import lv.activestudio.java2.ui.impl.ListRoomsView;
import lv.activestudio.java2.ui.impl.RemoveRoomView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ActiveStudioApplication {

    public static void main(String[] args) {

        RoomDAO roomDAO = new RoomDAOImpl();
        TeacherDAO teacherDAO = new TeacherDAOImpl();
        TimetableEntryDAO timetableEntryDAO = new TimetableEntryDAOImpl();
        TrainingClassDAO trainingClassDAO = new TrainingClassDAOImpl();

        AddRoomService addRoomService = new AddRoomServiceImpl(roomDAO);
        AddTeacherService addTeacherService = new AddTeacherServiceImpl(teacherDAO);
        AddTrainingClassService addTrainingClassService = new AddTrainingClassServiceImpl(trainingClassDAO);
        AddTimetableEntryService addTimetableEntryService = new AddTimetableEntryServiceImpl(timetableEntryDAO);

        ListRoomService listRoomService = new ListRoomServiceImpl(roomDAO);
        RemoveRoomService removeRoomService = new RemoveRoomServiceImpl(roomDAO);


        Map<Integer, View> commands = new HashMap<>();
        commands.put(1, new AddRoomView(addRoomService));
        commands.put(2, new ListRoomsView(listRoomService));
        commands.put(3, new AddTeacherView(addTeacherService));
        commands.put(11, new RemoveRoomView(removeRoomService));

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
        System.out.println("1. Add new room");
        System.out.println("2. List all rooms");
        /*System.out.println("3. Add new teacher");
        System.out.println("4. List all teachers");
        System.out.println("5. Add new class");
        System.out.println("6. List all classes");
        System.out.println("7. Add new class");
        System.out.println("8. List all classes");
        System.out.println("9. Create new timetable entry");
        System.out.println("10. List timetable for Say (1-7)");
        System.out.println("11. Remove timetable entry (classname, roomname)"); */
        System.out.println("11. Remove room (roomname)");
        System.out.println("12. Remove class (classname)");
        System.out.println("13. Remove teacher (lastname)");
        System.out.println("99. Exit");


    }
}
