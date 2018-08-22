package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static{
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Ken", "ken@codegym.vn", "Hanoi"));
        customers.put(2, new Customer(2, "Nghiem", "nghiem@codegym.vn", "Hanoi"));
        customers.put(3, new Customer(3,"Tuan", "tuan@codegym.vn", "Vinh Phuc"));
        customers.put(4, new Customer(4, "Vinh", "vinh@codegym.vn", "Ho Chi Minh City"));
        customers.put(5, new Customer(5, "Greg", "greg@codegym.vn", "New Castle"));
        customers.put(6, new Customer(6, "Nicklas", "@nicklas@codegym.vn", "Hamburg"));
        customers.put(7, new Customer(7, "Dome", "dome@codegym.vn", "Amsterdam"));
        customers.put(8, new Customer(8, "Shay Lubin", "shay@codegym.vn", "Dubai"));
        customers.put(9, new Customer(9, "Sandy", "sandy@codegym.vn", "Liverpool"));
        customers.put(10, new Customer(10, "Anna", "anna@codegym.vn", "St Petersburg"));
        customers.put(11, new Customer(11, "Ying Lua", "yinglua@codegym.vn", "Beijing"));
        customers.put(12, new Customer(12, "Minh", "minh@codegym.vn", "Hanoi"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
