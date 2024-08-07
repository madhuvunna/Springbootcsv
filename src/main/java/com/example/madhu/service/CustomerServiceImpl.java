package com.example.madhu.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.madhu.dao.CustomerRepository;
import com.example.madhu.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerrepository;

	public List<Customer> findAll() {
		return customerrepository.findAll();
	}

//	@Override
//	public Customer findById(int id) {
//
////		Optional<Customer> result = customerrepository.findById(id);
////
////		Customer customer = null;
////
////		if (result.isPresent()) {
////			customer = result.get();
////		}
//
//		Customer customer = null;
//		try {
//
//			customer = customerrepository.findById(id).get();
//
//		} catch (Exception e) {
//			new RuntimeException("Id not find.");
//		}
//
//		return customer;
//	}
//
//	@Override
//	public void save(Customer customer) {
//		customerrepository.save(customer);
//
//	}
//
//	@Override
//	public void deleteById(int id) {
//		customerrepository.deleteById(id);
//	}
}
