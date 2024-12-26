package simpleproject.project.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import simpleproject.project.demo.entity.customer;
import simpleproject.project.demo.service.CustomerService;

@RestController
public class customerController {
	
	@Autowired
	CustomerService sc;
	
	@PostMapping("/cust")
	public String addcustomer(@RequestBody customer s) {
		customer se = sc.addorUpdate(s);
		return "data added";
		
	}
	@GetMapping("/allshowcustomer")
	public List<customer>alldata() {
		return sc.allcustomer();
		
	}
	@GetMapping("get/{id}")
	public customer getperticular(@PathVariable("id")int id) {
		return sc.getperticular(id);
		
	}
	
	@DeleteMapping("/dlt/{id}")
	public String deleted(@PathVariable("id")int id) {
		sc.deletecustomer(id);
		return "deleted";
		
	}

}
