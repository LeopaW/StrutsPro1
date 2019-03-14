package web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Customer;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import java.util.List;
import java.util.Map;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    private Customer customer = new Customer();

    private CustomerService cs = new CustomerServiceImpl();

    private String username;

    public String add() throws Exception {

        cs.add(customer);
        return "toList";
    }
    public String list() throws Exception{
        Map<String, Object> session = ActionContext.getContext().getSession();

        DetachedCriteria dc = DetachedCriteria.forClass(Customer.class);
        if(StringUtils.isNotBlank(username)){
            dc.add(Restrictions.like("username","%"+username+"%"));
        }
        //获得离线查询对象

        List<Customer> list = cs.getAll(dc);

        session.put("list",list);
        return "list";
    }

    @Override
    public Customer getModel() {
        return customer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
