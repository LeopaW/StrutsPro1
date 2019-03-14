package dao;

import domain.Customer;

import java.util.List;

public interface CustomerDao {
    void save(Customer c);
    List<Customer> getAll();
}
