package lv.activestudio.java2.ui.impl;

import lv.activestudio.java2.businesslogic.AddRoomService;
import lv.activestudio.java2.businesslogic.api.add.AddRoomRequest;
import lv.activestudio.java2.ui.View;
import org.apache.log4j.Logger;

public class AddRoomView implements View {

    private AddRoomService addRoomService;

    public AddRoomView(AddRoomService addRoomService) {
        this.addRoomService = addRoomService;
    }

    @Override
    public void execute() {
        Logger.getRootLogger().debug("Executing AddRoomView - add new Room (Room1, 5, desc)");


        //business logic part
        addRoomService.addRoom(new AddRoomRequest("Room1", 5, "description of room1"));
        //end of BL

        Logger.getRootLogger().debug("Executing AddRoomView finished");
    }
}
