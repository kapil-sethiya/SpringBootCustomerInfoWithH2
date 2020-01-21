package org.atul.od.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.atul.od.dao.CustomerDao;
import org.atul.od.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class CustomerService {
 
	@Autowired
	CustomerDao customerDao;
 
	/*//@Transactional
	public List<Customer> getAllCustomersByName(String customerName) {
		List<Object[]> list=customerDao.findRecordCustomerName(customerName);
		List<Customer> clist=new ArrayList<Customer>();
		
			for(Object[] i:list) {
				clist.add(new Customer(String.valueOf(i[0]),String.valueOf(i[1])));
			}
		
		return clist;
	}*/
 
	//@Transactional
	public Customer getCustomer(int id) {
		return customerDao.findById(id).get();
	}
 
	//@Transactional
	public void addCustomer(Customer customer) {
		customerDao.save(customer);
	}
 
	//@Transactional
	public void updateCustomer(Customer customer) {
		customerDao.save(customer);
 
	}
 
	//@Transactional
	public void deleteCustomer(int id) {
		customerDao.deleteById(id);
	}
	//@Transactional
	public List<Customer> getAllCustomers() {
		return (List<Customer>) customerDao.findAll();
		
	}
}