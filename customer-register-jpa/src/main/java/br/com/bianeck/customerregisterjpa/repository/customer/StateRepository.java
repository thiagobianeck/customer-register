package br.com.bianeck.customerregisterjpa.repository.customer;

import br.com.bianeck.customerregisterjpa.model.customer.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
