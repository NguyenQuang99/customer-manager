package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer,Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Yui Hatano", "yui@hotchat.com", "Nhatban"));
        customers.put(2, new Customer(2, "Honda Nanako", "nanako@hotchat.com", "huaway"));
        customers.put(3, new Customer(3, "Yui Tachibana", "tachibana@hotchat.com", "Nhat"));
        customers.put(4, new Customer(4, "Duong Mich", "duong@hotchat.com", "HongKong"));
        customers.put(5, new Customer(5, "Luu Dao", "dao@hotchat.com", "trungquoc"));
        customers.put(6, new Customer(6, "Sagiri", "sagiri@hotchat.com", "Nhatban"));

    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);

    }

    @Override
    public Customer findById(int id) {

        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);

    }

    @Override
    public void remove(int id) {
        customers.remove(id);

    }
}
