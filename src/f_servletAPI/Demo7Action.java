package f_servletAPI;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//如何在action中获得原生ServletAPI
public class Demo7Action extends ActionSupport implements ServletRequestAware {

    private HttpServletRequest request;

    public String execute() throws Exception{
        System.out.println("原生request："+request);
        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest Request) {
        this.request = Request;
    }
}
