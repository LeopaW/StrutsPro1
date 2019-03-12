package f_servletAPI;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

//如何在action中获得原生ServletAPI
public class Demo6Action extends ActionSupport {
    //并不推荐
    public String execute() throws Exception{
        //原生request
        HttpServletRequest request = ServletActionContext.getRequest();
        //原生session
        HttpSession session = request.getSession();
        //原生response
        HttpServletResponse response = ServletActionContext.getResponse();
        //原生servletContext
        ServletContext servletContext = ServletActionContext.getServletContext();
        return SUCCESS;

    }
}
