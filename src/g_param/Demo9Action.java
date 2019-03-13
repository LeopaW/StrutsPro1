package g_param;

import com.opensymphony.xwork2.ActionSupport;

//struts2如何获得参数
//每次请求Action时都会创建新的Action实例对象
public class Demo9Action extends ActionSupport {

    public String execute() throws Exception{
        System.out.println();
        return SUCCESS;
    }

}
