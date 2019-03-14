package service;

import domain.Customer;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface CustomerService {
    void add(Customer customer);


    List<Customer> getAll(DetachedCriteria dc);

}
