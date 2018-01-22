package lv.activestudio.java2;

import lv.activestudio.java2.businesslogic.AddRoomService;
import lv.activestudio.java2.businesslogic.ListRoomService;
import lv.activestudio.java2.businesslogic.RemoveRoomService;
import lv.activestudio.java2.businesslogic.impl.add.AddRoomServiceImpl;
import lv.activestudio.java2.businesslogic.impl.list.ListRoomServiceImpl;
import lv.activestudio.java2.businesslogic.impl.remove.RemoveRoomServiceImpl;
import lv.activestudio.java2.database.dao.RoomDAO;
import lv.activestudio.java2.database.jdbc.RoomDAOImpl;
import lv.activestudio.java2.ui.View;
import lv.activestudio.java2.ui.impl.AddRoomView;
import lv.activestudio.java2.ui.impl.ListRoomsView;
import lv.activestudio.java2.ui.impl.RemoveRoomView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ActiveStudioApplication {

    public static void main(String[] args) {

        //use cases:
        //1.
        //2.

        RoomDAO roomDAO = new RoomDAOImpl();

        AddRoomService addRoomService = new AddRoomServiceImpl(roomDAO);
        ListRoomService listRoomService = new ListRoomServiceImpl(roomDAO);
        RemoveRoomService removeRoomService = new RemoveRoomServiceImpl(roomDAO);

        Map<Integer, View> commands = new HashMap<>();
        commands.put(1, new AddRoomView(addRoomService));
        commands.put(2, new ListRoomsView(listRoomService));
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
        System.out.println("3. Add new teacher");
        System.out.println("4. List all teachers");
        System.out.println("5. Add new class");
        System.out.println("6. List all classes");
        System.out.println("7. Add new class");
        System.out.println("8. List all classes");
        System.out.println("9. Create new timetable entry");
        System.out.println("10. List timetable for Say (1-7)");
        System.out.println("11. Remove timetable entry (classname, roomname)");
        System.out.println("11. Remove room (roomname)");
        System.out.println("12. Remove class (classname)");
        System.out.println("13. Remove teacher (lastname)");
        System.out.println("99. Exit");


    }
}
