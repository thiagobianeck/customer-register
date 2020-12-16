package br.com.bianeck.customerregisterjpa.repository.customer;

import br.com.bianeck.customerregisterjpa.model.customer.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
