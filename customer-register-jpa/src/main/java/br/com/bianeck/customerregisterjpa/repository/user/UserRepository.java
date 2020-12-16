package br.com.bianeck.customerregisterjpa.repository.user;

import br.com.bianeck.customerregisterjpa.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
