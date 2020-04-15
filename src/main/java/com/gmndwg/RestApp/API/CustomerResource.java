package com.gmndwg.RestApp.API;
import com.gmndwg.RestApp.Model.Customer;
import com.gmndwg.RestApp.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping(value = "/customers")
@RestController
public class CustomerResource {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){

        return customerService.addCustomer(customer);
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(value = "/{customerId}")
    public Customer getCustomer(@PathVariable("customerId")int customerId){
        return customerService.getCustomer(customerId);
    }
    @PutMapping(value = "/{customerId}")
    public Customer updateCustomer(@PathVariable("customerId")int customerId,@RequestBody Customer customer){
      return customerService.updateCustomer(customerId,customer);
    }
    @DeleteMapping(value = "/{customerId}")
    public void deleteCustomer(@PathVariable("customerId")int customerId){
        customerService.deleteCustomer(customerId);
    }
}
