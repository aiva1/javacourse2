package lv.activestudio.java2.ui.impl;

import lv.activestudio.java2.businesslogic.serviceinterfaces.ListTeacherService;
import lv.activestudio.java2.businesslogic.reqresp.list.ListTeacherResponse;
import lv.activestudio.java2.domain.Teacher;
import lv.activestudio.java2.ui.View;
import org.apache.log4j.Logger;

public class ListTeacherView implements View {

    private ListTeacherService service;

    public ListTeacherView(ListTeacherService listTeacherServicece) {

        service = listTeacherServicece;
    }

    @Override
    public void execute() {
        Logger.getRootLogger().debug("Executing ListTeacherView");

        //business logic
        ListTeacherResponse resp = service.getTeachers();
        //ListRoomResponse response = listRoomService.getRooms();
        //end of bl

        for (Teacher t : resp.getTeachers()) {
            Logger.getRootLogger().debug(t.getLastName() + ", ");
        }

        Logger.getRootLogger().debug("Executing ListTeacherView finished");
    }
}
