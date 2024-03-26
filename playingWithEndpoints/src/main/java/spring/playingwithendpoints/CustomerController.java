package spring.playingwithendpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> customerList = new ArrayList<>();
    @PostMapping("/saveCustomer")

    public void addCustomer (Customer customer){customerList.add(customer);}

    @GetMapping("/showCustomer")
    public List<Customer> showCustomers(){
        return customerList;
    }
}
