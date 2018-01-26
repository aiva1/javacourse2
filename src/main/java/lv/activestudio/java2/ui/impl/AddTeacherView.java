package lv.activestudio.java2.ui.impl;

import lv.activestudio.java2.businesslogic.AddTeacherService;
import lv.activestudio.java2.businesslogic.api.add.AddTeacherRequest;
import lv.activestudio.java2.businesslogic.api.add.AddTeacherResponse;
import lv.activestudio.java2.ui.View;
import org.apache.log4j.Logger;

public class AddTeacherView implements View {

    private AddTeacherService addTeacherService;

    public AddTeacherView(AddTeacherService addTeacherService) {
        this.addTeacherService = addTeacherService;
    }

    @Override
    public void execute() {
        Logger.getRootLogger().debug("Executing AddTeacherView - adding new Teacher(Kate, Billing, bio)");

        //business logic
        addTeacherService.addTeacher(new AddTeacherRequest("Kate", "Billing", "Kate's biography", "linkToPhoto"));
        //end of BL

        Logger.getRootLogger().debug("Executing AddTeacherView finished");
    }
}
