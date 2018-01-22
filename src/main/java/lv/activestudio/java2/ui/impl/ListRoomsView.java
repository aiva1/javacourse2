package lv.activestudio.java2.ui.impl;

import lv.activestudio.java2.businesslogic.ListRoomService;
import lv.activestudio.java2.businesslogic.api.list.ListRoomResponse;
import lv.activestudio.java2.domain.Room;
import lv.activestudio.java2.ui.View;
import org.apache.log4j.Logger;

public class ListRoomsView implements View {

    private ListRoomService listRoomService;

    public ListRoomsView(ListRoomService listRoomService) {
        this.listRoomService = listRoomService;
    }

    @Override
    public void execute() {
        Logger.getRootLogger().debug("Executing ListRoomsView.");

        //business logic
        ListRoomResponse response = listRoomService.getRooms();
        //end of bl

        for (Room r : response.getRooms()) {
            Logger.getRootLogger().debug(r.getName() + ", ");
        }

        Logger.getRootLogger().debug("Executing ListRoomsView finished");
    }
}
