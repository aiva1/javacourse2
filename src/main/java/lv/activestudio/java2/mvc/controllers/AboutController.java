package lv.activestudio.java2.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Returns about.jsp when accessing /about
 */
@Controller
@RequestMapping("about")
public class AboutController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView processRequest(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("about", "model", null);
        return modelAndView;
    }
}
