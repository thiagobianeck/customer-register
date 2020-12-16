package br.com.bianeck.customerregisterjpa.repository.customer;

import br.com.bianeck.customerregisterjpa.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
