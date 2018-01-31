package lv.activestudio.java2.mvc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Returns aboutClasses.jsp when accessing /aboutClasses
 * Info about classes should be retrieved from database TRAINING_CLASSES
 */
public class AboutClassesController {

    //@RequestMapping(value = "aboutClasses", method = RequestMethod.GET)
    public ModelAndView processRequest(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("aboutClasses", "model", null);
        return modelAndView;
    }
}
