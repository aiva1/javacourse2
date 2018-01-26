package lv.activestudio.java2.ui.impl;

import lv.activestudio.java2.businesslogic.RemoveTeacherService;
import lv.activestudio.java2.businesslogic.api.remove.RemoveTeacherRequest;
import lv.activestudio.java2.businesslogic.api.remove.RemoveTeacherResponse;
import lv.activestudio.java2.ui.View;
import org.apache.log4j.Logger;

public class RemoveTeacherView implements View {

    private RemoveTeacherService service;

    public RemoveTeacherView(RemoveTeacherService removeTeacherService) {

            service = removeTeacherService;
    }

    @Override
    public void execute() {
        Logger.getRootLogger().debug("Executing RemoveTeacherView");

        //business logic
         RemoveTeacherResponse response = service.removeByLastname(new RemoveTeacherRequest("Billing"));
        Logger.getRootLogger().debug("Removing teacher with lastname Billing");
        //end of BL

        Logger.getRootLogger().debug("Executing RemoveTeacherView finished");
    }
}
