package service.impl;



import dao.CustomerDao;
import dao.impl.CustomerDaoImpl;
import domain.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import service.CustomerService;
import utils.HibernateUtils;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao = new CustomerDaoImpl();

    @Override
    public void add(Customer c) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction tx = session.beginTransaction();
        customerDao.save(c);
        tx.commit();
    }

    @Override
    public List<Customer> getAll(DetachedCriteria dc) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Customer> list = customerDao.getAll();



        tx.commit();
        return list;
    }

}
