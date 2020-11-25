package Controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private ProducerTemplate producer;
	

@GetMapping("/customers")	
	public String getCustomers() {
	List<Customer> customers =producer.requestBody("direct:select", null,)
	return customers;
}
@PostMapping("/customers")
public boolean insertCustomer() {
	
	return false;
	
}
}
