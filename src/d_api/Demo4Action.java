package d_api;

import com.opensymphony.xwork2.Action;

//Action类的书写方式
//方式2：实现一个接口Action
//里面有execute方法，提供action方法规范
//Action接口预置了一些字符串。可以在返回结果使用，为了方便
public class Demo4Action implements Action {

    @Override
    public String execute() throws Exception {
        System.out.println();
        return SUCCESS;
    }

}
