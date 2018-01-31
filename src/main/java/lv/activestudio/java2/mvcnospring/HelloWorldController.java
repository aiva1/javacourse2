package lv.activestudio.java2.mvcnospring;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Controller to test/playaround with MVC functionality.
 * It is not part of the application.
 */
@Component
public class HelloWorldController implements MVCController {

    @Override
    public MVCModel processGet(HttpServletRequest request) {
        return new MVCModel("/helloWorld.jsp", "GET method processed :)");
    }

    @Override
    public MVCModel processPost(HttpServletRequest request) {
        return null;
    }
}
