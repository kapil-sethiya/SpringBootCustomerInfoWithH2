package org.atul.od.dao;

import java.util.List;

import org.atul.od.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;


public interface CustomerDao extends CrudRepository<Customer,Integer>  {
	
	
	
	
	
}
