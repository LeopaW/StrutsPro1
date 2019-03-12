package g_param;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

//struts2如何获得参数
//每次请求Action时都会创建新的Action实例对象
public class Demo8Action extends ActionSupport {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String execute() throws Exception{
        System.out.println("name:"+name);
        return SUCCESS;
    }

}
