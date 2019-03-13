package g_param;

import com.opensymphony.xwork2.ActionSupport;
import domain.User;

import java.util.List;
import java.util.Map;

//struts2如何获得参数
//每次请求Action时都会创建新的Action实例对象
public class Demo11Action extends ActionSupport{
    //准备user 成员变量
    List<String> list;
    Map<String,String> map;

    public String execute() throws Exception{
        System.out.println("list:"+list);
        System.out.println("map:"+map);
        return SUCCESS;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
