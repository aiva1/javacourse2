package lv.activestudio.java2.mvc;

import lv.activestudio.java2.config.SpringAppConfig;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * The written-by-hand implementation of Dispatcher Servlet which is an entry point for requests.
 * This does NOT use Spring MVC.
 * NOTE: this class needs to be specified in web.xml
 */
public class MVCDispatcherFilter implements Filter {

    private ApplicationContext appContext;
    private Map<String, MVCController> controllerMapping;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Logger.getRootLogger().debug("Dispatcher Servlet: init()");

        try {
            appContext = new AnnotationConfigApplicationContext(SpringAppConfig.class);
        } catch (BeansException e) {
            Logger.getRootLogger().debug("Spring context failed to start (in DispatcherServlet init)");
        }

        controllerMapping = new HashMap<>();
        controllerMapping.put("/hello", getControllerBean(HelloWorldController.class));
    }


    private MVCController getControllerBean(Class beanClass) {
        return (MVCController) appContext.getBean(beanClass);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse resp = (HttpServletResponse)response;

        String contextURI = req.getServletPath();

        if (controllerMapping.keySet().contains(contextURI)){
            MVCController controller = controllerMapping.get(contextURI);

            MVCModel model = null;

            String method = req.getMethod();

            if ("GET".equalsIgnoreCase(method)) {
                model = controller.processGet(req);
            }
            if ("POST".equalsIgnoreCase(method)) {
                model = controller.processPost(req);
            }

            req.setAttribute("model", model.getData());

            ServletContext context = req.getServletContext();
            RequestDispatcher requestDispatcher =
                    context.getRequestDispatcher(model.getView());
            requestDispatcher.forward(req, resp);
        }
        else {
            chain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {

    }
}
