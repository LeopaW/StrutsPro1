package g_param;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.User;

//struts2如何获得参数
//每次请求Action时都会创建新的Action实例对象
public class Demo10Action extends ActionSupport implements ModelDriven<User> {
    //准备user 成员变量
    private User user = new User();

    public String execute() throws Exception{
        System.out.println(user);
        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }
}
