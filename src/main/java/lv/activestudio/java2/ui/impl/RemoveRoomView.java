package lv.activestudio.java2.ui.impl;

import lv.activestudio.java2.ui.View;
import org.apache.log4j.Logger;

public class RemoveRoomView implements View {

//    private RemoveRoomService removeRoomService;

    public RemoveRoomView() {

//        this.removeRoomService = removeRoomService;
    }

    @Override
    public void execute() {
        Logger.getRootLogger().debug("Executing RemoveRoomView");

        //business logic
       // RemoveRoomResponse response = removeRoomService.removeByName(new RemoveRoomRequest("Riga1"));
        Logger.getRootLogger().debug("Removing room with name Riga1");
        //end of BL

        Logger.getRootLogger().debug("Executing RemoveRoomView finished");
    }
}
