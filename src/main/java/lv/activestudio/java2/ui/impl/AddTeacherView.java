package lv.activestudio.java2.ui.impl;

import lv.activestudio.java2.businesslogic.AddTeacherService;
import lv.activestudio.java2.businesslogic.api.add.AddTeacherRequest;
import lv.activestudio.java2.businesslogic.api.add.AddTeacherResponse;
import lv.activestudio.java2.ui.View;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddTeacherView implements View {

    @Autowired
    private AddTeacherService addTeacherService;

    @Override
    public void execute() {
        Logger.getRootLogger().debug("Executing AddTeacherView - adding new Teacher(Adam, Billing, bio, linkToPhoto.png)");

        //business logic
        addTeacherService.addTeacher(new AddTeacherRequest("Adam", "Billing", "Kate's biography", "linkToPhoto.png"));
        //end of BL

        Logger.getRootLogger().debug("Executing AddTeacherView finished");
    }
}
