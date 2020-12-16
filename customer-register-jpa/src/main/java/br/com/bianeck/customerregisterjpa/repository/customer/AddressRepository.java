package br.com.bianeck.customerregisterjpa.repository.customer;

import br.com.bianeck.customerregisterjpa.model.customer.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
