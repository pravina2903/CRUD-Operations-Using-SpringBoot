package simpleproject.project.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.persistence.Id;
import simpleproject.project.demo.entity.customer;
import simpleproject.project.demo.repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo repo;
	
	public customer addorUpdate(customer c) {
		return repo.save(c);
		
	}
	public List<customer> allcustomer() {
		return repo.findAll();
		
		
	}
	
	public customer getperticular(int id) {
		return repo.findById(id).get();
		
	}
		public String deletecustomer(int id) {
			customer d=getperticular(id);
			repo.delete(d);
			return "deleted sucessfully";
			
		}
	}
	


