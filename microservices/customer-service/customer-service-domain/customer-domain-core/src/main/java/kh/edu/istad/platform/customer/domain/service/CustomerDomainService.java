package kh.edu.istad.platform.customer.domain.service;

import kh.edu.istad.platform.customer.domain.entity.Customer;
import kh.edu.istad.platform.customer.domain.event.CustomerDeactivateEvent;
import kh.edu.istad.platform.customer.domain.event.CustomerInitiatedEvent;
import kh.edu.istad.platform.customer.domain.event.CustomerUpdateEvent;

public interface CustomerDomainService {

    CustomerInitiatedEvent initiateCustomer(Customer customer);
    CustomerUpdateEvent updateCustomer(Customer customer);
    CustomerDeactivateEvent deactivateCustomer(Customer customer);

}
