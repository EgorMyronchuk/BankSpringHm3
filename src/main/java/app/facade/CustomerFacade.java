package app.facade;

import app.dto.CustomerRequest;
import app.dto.CustomerResponse;
import app.dto.EmployerRequest;
import app.dto.EmployerResponse;
import app.model.Customer;
import app.model.Employer;
import org.springframework.stereotype.Component;

@Component
public class CustomerFacade {

    public Customer convertToEntity(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setEmail(customerRequest.getEmail());
        customer.setAge(customerRequest.getAge());
        customer.setPassword(customerRequest.getPassword());
        customer.setPhone(customerRequest.getPhone());

        return customer;
    }

    public CustomerResponse convertToResponse(Customer customer) {
        CustomerResponse response = new CustomerResponse();
        response.setId(customer.getId());
        response.setName(customer.getName());
        response.setEmail(customer.getEmail());
        response.setAge(customer.getAge());
        response.setPhone(customer.getPhone());
        response.setAccounts(customer.getAccounts());
        response.setEmployers(customer.getEmployers());

        return response;
    }

}
